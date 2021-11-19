public void onScaleChanged(float scaleFactor_p) {
    if (scaleFactor_p != (mScaleFactor)) {
        mScaleFactor = scaleFactor_p;
        mCellHeight = ((int) ((mDefaultCellHeight) * scaleFactor_p));
        requestLayout();
        invalidate();
    }
}