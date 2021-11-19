@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    try {
        doDisconnect();
        this.wait(1000);
        doConnect();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}