@java.lang.Override
public void run() {
    mSwipeRefreshLayout.setRefreshing(false);
    addFeedItem(new com.saltycode.android.material2.material_playground.model.FeedItem("External User", "This message was downloaded from the Internet", 0));
}