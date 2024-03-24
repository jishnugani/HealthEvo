// Generated by view binder compiler. Do not edit!
package com.unicon.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.unicon.mini.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button BCamera;

  @NonNull
  public final Button BQr;

  @NonNull
  public final Button BRemedies;

  @NonNull
  public final Button BUpload;

  @NonNull
  public final ConstraintLayout relativeLayout;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button BCamera,
      @NonNull Button BQr, @NonNull Button BRemedies, @NonNull Button BUpload,
      @NonNull ConstraintLayout relativeLayout) {
    this.rootView = rootView;
    this.BCamera = BCamera;
    this.BQr = BQr;
    this.BRemedies = BRemedies;
    this.BUpload = BUpload;
    this.relativeLayout = relativeLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.B_camera;
      Button BCamera = ViewBindings.findChildViewById(rootView, id);
      if (BCamera == null) {
        break missingId;
      }

      id = R.id.B_qr;
      Button BQr = ViewBindings.findChildViewById(rootView, id);
      if (BQr == null) {
        break missingId;
      }

      id = R.id.B_remedies;
      Button BRemedies = ViewBindings.findChildViewById(rootView, id);
      if (BRemedies == null) {
        break missingId;
      }

      id = R.id.B_upload;
      Button BUpload = ViewBindings.findChildViewById(rootView, id);
      if (BUpload == null) {
        break missingId;
      }

      ConstraintLayout relativeLayout = (ConstraintLayout) rootView;

      return new ActivityMainBinding((ConstraintLayout) rootView, BCamera, BQr, BRemedies, BUpload,
          relativeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
