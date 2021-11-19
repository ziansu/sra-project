@java.lang.Override
public void onRefresh() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            swipeRefresh.setRefreshing(false);
        }
    }, 2000);
    this.messageCount += 10;
    getMessages();
}