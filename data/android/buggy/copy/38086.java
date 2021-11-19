protected void bringToFront() {
    android.view.ViewParent parent = _layout.getParent();
    parent.bringChildToFront(_layout);
    parent.requestLayout();
}