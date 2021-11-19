@java.lang.Override
public void run() {
    swipeRefreshLayout.setRefreshing(false);
    result = null;
    loadingMore = true;
    getData();
}