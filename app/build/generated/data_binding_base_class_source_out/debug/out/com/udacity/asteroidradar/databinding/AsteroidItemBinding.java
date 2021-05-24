// Generated by data binding compiler. Do not edit!
package com.udacity.asteroidradar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.udacity.asteroidradar.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AsteroidItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageIcon;

  @NonNull
  public final TextView textDate;

  @NonNull
  public final TextView textTitle;

  protected AsteroidItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageIcon, TextView textDate, TextView textTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageIcon = imageIcon;
    this.textDate = textDate;
    this.textTitle = textTitle;
  }

  @NonNull
  public static AsteroidItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.asteroid_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AsteroidItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AsteroidItemBinding>inflateInternal(inflater, R.layout.asteroid_item, root, attachToRoot, component);
  }

  @NonNull
  public static AsteroidItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.asteroid_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AsteroidItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AsteroidItemBinding>inflateInternal(inflater, R.layout.asteroid_item, null, false, component);
  }

  public static AsteroidItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AsteroidItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (AsteroidItemBinding)bind(component, view, R.layout.asteroid_item);
  }
}