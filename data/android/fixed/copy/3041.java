@java.lang.Override
public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
    swipeRefreshLayout.setEnabled(false);
    return super.onScaleBegin(detector);
}