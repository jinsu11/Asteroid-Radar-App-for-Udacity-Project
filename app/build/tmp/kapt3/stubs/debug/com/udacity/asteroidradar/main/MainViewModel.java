package com.udacity.asteroidradar.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/udacity/asteroidradar/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_fetchedAsteroidProperty", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/udacity/asteroidradar/Asteroid;", "_pictureUrl", "", "_selectedAsteroid", "_status", "", "dataSource", "Lcom/udacity/asteroidradar/database/AsteroidDao;", "getDataSource", "()Lcom/udacity/asteroidradar/database/AsteroidDao;", "fetchedAsteroidProperty", "Landroidx/lifecycle/LiveData;", "getFetchedAsteroidProperty", "()Landroidx/lifecycle/LiveData;", "pictureUrl", "getPictureUrl", "recyclerAdapter", "Lcom/udacity/asteroidradar/RecyclerAdapter;", "getRecyclerAdapter", "()Lcom/udacity/asteroidradar/RecyclerAdapter;", "selectedAsteroid", "getSelectedAsteroid", "status", "getStatus", "doneNavigating", "", "getAsteroidProperties", "getSavedAsteroids", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> _fetchedAsteroidProperty = null;
    private final androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.Asteroid> _selectedAsteroid = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _pictureUrl = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.asteroidradar.database.AsteroidDao dataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.udacity.asteroidradar.RecyclerAdapter recyclerAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MainViewModel";
    public static final int LOADING = android.view.View.VISIBLE;
    public static final int LOADING_DONE = android.view.View.GONE;
    public static final com.udacity.asteroidradar.main.MainViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> getFetchedAsteroidProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.udacity.asteroidradar.Asteroid> getSelectedAsteroid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPictureUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.asteroidradar.database.AsteroidDao getDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.asteroidradar.RecyclerAdapter getRecyclerAdapter() {
        return null;
    }
    
    public final void getAsteroidProperties() {
    }
    
    public final void getSavedAsteroids() {
    }
    
    public final void doneNavigating() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/udacity/asteroidradar/main/MainViewModel$Companion;", "", "()V", "LOADING", "", "LOADING_DONE", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}