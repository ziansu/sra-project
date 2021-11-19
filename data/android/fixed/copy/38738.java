@java.lang.Override
protected void onStop() {
    super.onStop();
    mEyeGestureManager.unregister(target1, mEyeGestureListener);
    mEyeGestureManager.unregister(target2, mEyeGestureListener);
}