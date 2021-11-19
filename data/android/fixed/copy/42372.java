@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    v.getLayoutParams().height = (interpolatedTime == 1) ? targetHeight : ((int) (targetHeight * interpolatedTime));
    v.requestLayout();
}