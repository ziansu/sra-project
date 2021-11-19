@java.lang.Override
public void onRefresh(java.lang.String data) {
    try {
        java.lang.Thread.sleep(3000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    refreshableChatEntity.finishRefreshing();
}