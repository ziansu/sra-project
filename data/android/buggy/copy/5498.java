@java.lang.Override
public void onRefresh() {
    refreshList();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            swipeRefreshLayout.setRefreshing(false);
        }
    }, 1500);
}