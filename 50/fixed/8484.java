@java.lang.Override
public void onScaleEnd(android.view.ScaleGestureDetector detector) {
    super.onScaleEnd(detector);
    swipeRefreshLayout.setEnabled(true);
}