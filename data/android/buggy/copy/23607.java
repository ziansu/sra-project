@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    mRecyclerViewScrollY += dy;
    stickHeaderViewPagerManager.onRecyclerViewScroll(recyclerView, mRecyclerViewScrollY, position);
}