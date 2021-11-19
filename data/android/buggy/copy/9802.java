@java.lang.Override
public void onFailure(int error_code) {
    if (mSwipeRefreshLayout.isRefreshing()) {
        mSwipeRefreshLayout.setRefreshing(false);
    }
    failureHandler(error_code);
}