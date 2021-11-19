private void placeView(android.content.Context context) {
    if (((mMenuView) == null) || ((mContentView) == null)) {
        throw new java.lang.NullPointerException("The content and menu can not be null!");
    }
    addView(mContentView, 0);
    addView(mMenuView, 1);
}