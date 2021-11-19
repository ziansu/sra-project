@java.lang.Override
public void onRefresh() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRefresher.setRefreshing(false);
            setupRecycler();
            onItemsChanged();
        }
    }, 2500);
}