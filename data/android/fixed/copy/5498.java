@java.lang.Override
public void onRefresh() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refreshList();
            swipeRefreshLayout.setRefreshing(false);
        }
    }, 1500);
}