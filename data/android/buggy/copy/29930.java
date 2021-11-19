@java.lang.Override
public void onRefresh() {
    if (net.ilexiconn.hipster.thread.LoginThread.isLoggedIn()) {
        refresh(net.ilexiconn.hipster.thread.LoginThread.getMagister());
    }
}