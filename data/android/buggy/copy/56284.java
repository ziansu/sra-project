@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if ((mInsetBackground) != null) {
        mInsetBackground.setCallback(null);
    }
}