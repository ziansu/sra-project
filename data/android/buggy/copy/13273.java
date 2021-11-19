@java.lang.Override
public void hideLoadingIndicator() {
    mLoadingView.hideLoadingIndicator();
    if (mSwipeRefreshLayout.isRefreshing()) {
        mSwipeRefreshLayout.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }
}