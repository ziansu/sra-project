@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    requestVisualizer(false, 0);
}