public int getFirstVisibleScrollPosition() {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager()));
    return layoutManager.findFirstVisibleItemPosition();
}