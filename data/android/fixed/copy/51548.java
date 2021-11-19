private void initViews(android.view.View view) {
    fetchingItems = ((android.widget.LinearLayout) (view.findViewById(R.id.listEmptyView)));
    itemsListRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.photosListRecyclerView)));
}