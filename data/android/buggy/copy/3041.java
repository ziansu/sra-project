@java.lang.Override
public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
    swipeRefreshLayout.setEnabled(false);
    mediaAdapter.setOnClickListener(null);
    mediaAdapter.setOnLongClickListener(null);
    return super.onScaleBegin(detector);
}