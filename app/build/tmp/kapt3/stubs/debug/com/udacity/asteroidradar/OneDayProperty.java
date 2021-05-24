package com.udacity.asteroidradar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003JK\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0001J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001e\u00a8\u00060"}, d2 = {"Lcom/udacity/asteroidradar/OneDayProperty;", "", "id", "", "name", "absolute_magnitude_h", "", "estimated_diameter", "Lcom/udacity/asteroidradar/EstimatedDiameter;", "is_potentially_hazardous_asteroid", "", "close_approach_data", "", "Lcom/udacity/asteroidradar/CloseApproachData;", "(Ljava/lang/String;Ljava/lang/String;DLcom/udacity/asteroidradar/EstimatedDiameter;ZLjava/util/List;)V", "getAbsolute_magnitude_h", "()D", "setAbsolute_magnitude_h", "(D)V", "getClose_approach_data", "()Ljava/util/List;", "setClose_approach_data", "(Ljava/util/List;)V", "getEstimated_diameter", "()Lcom/udacity/asteroidradar/EstimatedDiameter;", "setEstimated_diameter", "(Lcom/udacity/asteroidradar/EstimatedDiameter;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "set_potentially_hazardous_asteroid", "(Z)V", "getName", "setName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class OneDayProperty {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private double absolute_magnitude_h;
    @org.jetbrains.annotations.NotNull()
    private com.udacity.asteroidradar.EstimatedDiameter estimated_diameter;
    private boolean is_potentially_hazardous_asteroid;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.udacity.asteroidradar.CloseApproachData> close_approach_data;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getAbsolute_magnitude_h() {
        return 0.0;
    }
    
    public final void setAbsolute_magnitude_h(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.asteroidradar.EstimatedDiameter getEstimated_diameter() {
        return null;
    }
    
    public final void setEstimated_diameter(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.EstimatedDiameter p0) {
    }
    
    public final boolean is_potentially_hazardous_asteroid() {
        return false;
    }
    
    public final void set_potentially_hazardous_asteroid(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.udacity.asteroidradar.CloseApproachData> getClose_approach_data() {
        return null;
    }
    
    public final void setClose_approach_data(@org.jetbrains.annotations.NotNull()
    java.util.List<com.udacity.asteroidradar.CloseApproachData> p0) {
    }
    
    public OneDayProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double absolute_magnitude_h, @org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.EstimatedDiameter estimated_diameter, boolean is_potentially_hazardous_asteroid, @org.jetbrains.annotations.NotNull()
    java.util.List<com.udacity.asteroidradar.CloseApproachData> close_approach_data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.asteroidradar.EstimatedDiameter component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.udacity.asteroidradar.CloseApproachData> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.udacity.asteroidradar.OneDayProperty copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double absolute_magnitude_h, @org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.EstimatedDiameter estimated_diameter, boolean is_potentially_hazardous_asteroid, @org.jetbrains.annotations.NotNull()
    java.util.List<com.udacity.asteroidradar.CloseApproachData> close_approach_data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}