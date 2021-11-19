private android.view.View getHeaderViewByType(int itemType) {
    if (!(isHeaderType(itemType)))
        return null;
    
    return mHeaderViews.get((itemType - (com.jinqiang.RecyclerViewRefresh.IRecyclerView.HEADER_INIT_INDEX)));
}