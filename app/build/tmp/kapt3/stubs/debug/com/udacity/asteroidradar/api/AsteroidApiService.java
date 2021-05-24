package com.udacity.asteroidradar.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/udacity/asteroidradar/api/AsteroidApiService;", "", "getPictureProperty", "Lcom/udacity/asteroidradar/PictureOfDay;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProperties", "Lcom/udacity/asteroidradar/AsteroidProperty;", "app_debug"})
public abstract interface AsteroidApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/neo/rest/v1/feed")
    public abstract java.lang.Object getProperties(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.asteroidradar.AsteroidProperty> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "planetary/apod")
    public abstract java.lang.Object getPictureProperty(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.udacity.asteroidradar.PictureOfDay> p0);
}