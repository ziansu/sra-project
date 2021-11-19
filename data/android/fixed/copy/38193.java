@java.lang.Override
public void onRefresh(java.lang.String data) {
    try {
        java.lang.Thread.sleep(3000);
        java.lang.System.out.println(data);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    refreshableChatEntity.finishRefreshing();
}