@java.lang.Override
public void run() {
    try {
        com.chd.TClient.getinstance().CheckVer("4.0.0");
    } catch (java.lang.Exception e) {
        checkUpdateHandler.sendEmptyMessage((-1));
    }
}