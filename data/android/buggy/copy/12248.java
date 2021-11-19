@java.lang.Override
public void onLoadMore(int page, int totalItemsCount, boolean direction) {
    if (direction)
        addFuture();
    else
        addPast();
    
    customLoadMoreDataFromApi(page);
}