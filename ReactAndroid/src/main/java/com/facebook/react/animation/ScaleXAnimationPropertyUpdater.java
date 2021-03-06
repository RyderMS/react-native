/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.animation;

import android.view.View;

/**
 * Subclass of {@link AnimationPropertyUpdater} for animating view's X scale
 */
public class ScaleXAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {

  public ScaleXAnimationPropertyUpdater(float toValue) {
    super(toValue);
  }

  public ScaleXAnimationPropertyUpdater(float fromValue, float toValue) {
    super(fromValue, toValue);
  }

  @Override
  protected float getProperty(View view) {
    return view.getScaleX();
  }

  @Override
  protected void setProperty(View view, float propertyValue) {
    view.setScaleX(propertyValue);
  }
}
