@java.lang.Override
public void onRefresh() {
    if ((swipeRefresh.getScrollY()) == 0) {
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                refreshActivity();
            }
        }, 1500);
    }
}