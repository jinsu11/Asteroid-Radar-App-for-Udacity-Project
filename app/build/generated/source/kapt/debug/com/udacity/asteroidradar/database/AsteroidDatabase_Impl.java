package com.udacity.asteroidradar.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidDatabase_Impl extends AsteroidDatabase {
  private volatile AsteroidDao _asteroidDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `asteroid` (`id` INTEGER NOT NULL, `codename` TEXT NOT NULL, `close_approach_date` TEXT NOT NULL, `absolute_magnitude` REAL NOT NULL, `estimated_diameter` REAL NOT NULL, `relative_velocity` REAL NOT NULL, `distance_from_earth` REAL NOT NULL, `is_potentially_hazardous` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b54f50dfad5bb159493671dbf16154a9')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `asteroid`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAsteroid = new HashMap<String, TableInfo.Column>(8);
        _columnsAsteroid.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("codename", new TableInfo.Column("codename", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("close_approach_date", new TableInfo.Column("close_approach_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("absolute_magnitude", new TableInfo.Column("absolute_magnitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("estimated_diameter", new TableInfo.Column("estimated_diameter", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("relative_velocity", new TableInfo.Column("relative_velocity", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("distance_from_earth", new TableInfo.Column("distance_from_earth", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAsteroid.put("is_potentially_hazardous", new TableInfo.Column("is_potentially_hazardous", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAsteroid = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAsteroid = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAsteroid = new TableInfo("asteroid", _columnsAsteroid, _foreignKeysAsteroid, _indicesAsteroid);
        final TableInfo _existingAsteroid = TableInfo.read(_db, "asteroid");
        if (! _infoAsteroid.equals(_existingAsteroid)) {
          return new RoomOpenHelper.ValidationResult(false, "asteroid(com.udacity.asteroidradar.database.AsteroidEntity).\n"
                  + " Expected:\n" + _infoAsteroid + "\n"
                  + " Found:\n" + _existingAsteroid);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b54f50dfad5bb159493671dbf16154a9", "12487b9cbc0a87ba68357d8d6cda1070");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "asteroid");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `asteroid`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AsteroidDao getAsteroidDatabaseDao() {
    if (_asteroidDao != null) {
      return _asteroidDao;
    } else {
      synchronized(this) {
        if(_asteroidDao == null) {
          _asteroidDao = new AsteroidDao_Impl(this);
        }
        return _asteroidDao;
      }
    }
  }
}
