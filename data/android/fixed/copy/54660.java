public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    if ((dx != 0) || (dy != 0))
        this.maybeFireLoadMore();
    
}