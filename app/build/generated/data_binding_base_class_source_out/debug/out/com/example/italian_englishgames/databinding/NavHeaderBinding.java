// Generated by view binder compiler. Do not edit!
package com.example.italian_englishgames.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.italian_englishgames.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class NavHeaderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout navHeader;

  private NavHeaderBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout navHeader) {
    this.rootView = rootView;
    this.navHeader = navHeader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavHeaderBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout navHeader = (ConstraintLayout) rootView;

    return new NavHeaderBinding((ConstraintLayout) rootView, navHeader);
  }
}