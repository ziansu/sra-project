public void onScaleChanged(float scaleFactor_p) {
    mScaleFactor = scaleFactor_p;
    mCellHeight = ((int) ((mDefaultCellHeight) * scaleFactor_p));
    requestLayout();
    invalidate();
}