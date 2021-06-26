// Generated by data binding compiler. Do not edit!
package com.example.italian_englishgames.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.italian_englishgames.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUsernamePhotoSelectionBinding extends ViewDataBinding {
  @NonNull
  public final Button btn;

  @NonNull
  public final ImageView img;

  @NonNull
  public final Button imgbtn;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final EditText username;

  protected FragmentUsernamePhotoSelectionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btn, ImageView img, Button imgbtn, TextView textView5,
      TextView textView6, EditText username) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btn = btn;
    this.img = img;
    this.imgbtn = imgbtn;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.username = username;
  }

  @NonNull
  public static FragmentUsernamePhotoSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_username_photo_selection, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUsernamePhotoSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUsernamePhotoSelectionBinding>inflateInternal(inflater, R.layout.fragment_username_photo_selection, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUsernamePhotoSelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_username_photo_selection, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUsernamePhotoSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUsernamePhotoSelectionBinding>inflateInternal(inflater, R.layout.fragment_username_photo_selection, null, false, component);
  }

  public static FragmentUsernamePhotoSelectionBinding bind(@NonNull View view) {
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
  public static FragmentUsernamePhotoSelectionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentUsernamePhotoSelectionBinding)bind(component, view, R.layout.fragment_username_photo_selection);
  }
}