@java.lang.Override
public void onRefresh() {
    if ((comments) != null) {
        comments.loadMore(adapter, subreddit);
    }else {
        mSwipeRefreshLayout.setRefreshing(false);
    }
}