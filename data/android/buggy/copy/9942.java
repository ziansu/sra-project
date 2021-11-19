@java.lang.Override
public void onRefresh() {
    presenter.performCall("berlin");
    swipeRefreshLayout.setRefreshing(false);
}