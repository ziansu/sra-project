@java.lang.Override
public void onDragEnabled() {
    mRecyclerView.getParent().requestDisallowInterceptTouchEvent(true);
    view.setOnClickListener(null);
}