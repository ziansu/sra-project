@java.lang.Override
public void onGlobalLayout() {
    if ((height) == 0) {
        calculateVisibleInvisibleHeight();
    }
    height = mCategoryGirdView.getHeight();
}