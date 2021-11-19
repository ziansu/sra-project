public float getToolbarPaddingTop() {
    if ((mToolbarPaddingTop) >= 0) {
        return mToolbarPaddingTop;
    }
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        mToolbarPaddingTop = 0;
    }else {
        mToolbarPaddingTop = 25;
    }
    return mToolbarPaddingTop;
}