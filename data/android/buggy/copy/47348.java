@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    if (page > 8)
        return false;
    
    onImageSearch(page, handler);
    return true;
}