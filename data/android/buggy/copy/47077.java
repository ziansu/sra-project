@java.lang.Override
public void onFinish(java.util.List<com.java.group19.data.News> newsList) {
    adapter[com.java.group19.activity.MainActivity.category].setNewsList(newsList);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            swipeRefreshLayout.setRefreshing(false);
        }
    });
}