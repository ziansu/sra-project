@java.lang.Override
public void onRefresh() {
    presenter.performCall();
    swipeRefreshLayout.setRefreshing(false);
}