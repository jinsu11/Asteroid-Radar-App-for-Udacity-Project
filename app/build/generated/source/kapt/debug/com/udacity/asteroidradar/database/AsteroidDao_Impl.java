package com.udacity.asteroidradar.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidDao_Impl implements AsteroidDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AsteroidEntity> __insertionAdapterOfAsteroidEntity;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public AsteroidDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAsteroidEntity = new EntityInsertionAdapter<AsteroidEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `asteroid` (`id`,`codename`,`close_approach_date`,`absolute_magnitude`,`estimated_diameter`,`relative_velocity`,`distance_from_earth`,`is_potentially_hazardous`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AsteroidEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getCodename() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCodename());
        }
        if (value.getCloseApproachDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCloseApproachDate());
        }
        stmt.bindDouble(4, value.getAbsoluteMagnitude());
        stmt.bindDouble(5, value.getEstimatedDiameter());
        stmt.bindDouble(6, value.getRelativeVelocity());
        stmt.bindDouble(7, value.getDistanceFromEarth());
        final int _tmp;
        _tmp = value.isPotentiallyHazardous() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM asteroid";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final AsteroidEntity asteroid, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAsteroidEntity.insert(asteroid);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clear(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getAllAsteroids(final Continuation<? super List<AsteroidEntity>> p0) {
    final String _sql = "SELECT * FROM asteroid ORDER BY close_approach_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<AsteroidEntity>>() {
      @Override
      public List<AsteroidEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "close_approach_date");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absolute_magnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimated_diameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relative_velocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distance_from_earth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "is_potentially_hazardous");
          final List<AsteroidEntity> _result = new ArrayList<AsteroidEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AsteroidEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new AsteroidEntity(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
