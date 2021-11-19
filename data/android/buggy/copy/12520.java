@java.lang.Override
public void onRefresh() {
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            data.clear();
            getData();
            index = 1;
        }
    }, 2000);
}