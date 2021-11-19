@java.lang.Override
public void onRefresh() {
    setupRecycler();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRefresher.setRefreshing(false);
        }
    }, 2500);
    onItemsChanged();
}