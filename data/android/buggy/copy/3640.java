@java.lang.Override
public void onRefresh() {
    mSwipe.setRefreshing(true);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mTimeLineAdapter) != null) {
                requestNewTweets(mTimeLineAdapter.getFirstTweet());
            }
        }
    });
}