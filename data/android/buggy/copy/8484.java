@java.lang.Override
public void onScaleEnd(android.view.ScaleGestureDetector detector) {
    super.onScaleEnd(detector);
    mediaAdapter.setOnClickListener(photosOnClickListener);
    mediaAdapter.setOnLongClickListener(photosOnLongClickListener);
    swipeRefreshLayout.setEnabled(true);
}