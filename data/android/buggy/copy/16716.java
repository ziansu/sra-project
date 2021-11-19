public void attachTo(android.support.v7.widget.RecyclerView recyclerView) {
    if (recyclerView != null) {
        adapter = new com.liangmayong.base.widget.recycler.RecyclerListView.ItemPoolRecyclerViewAdapter(this);
        recyclerView.setAdapter(((com.liangmayong.base.widget.recycler.RecyclerListView.ItemPoolRecyclerViewAdapter) (adapter)));
    }
}