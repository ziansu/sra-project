@java.lang.Override
public void onError(java.lang.Throwable e) {
    setMatchStarting(false);
    listener.onToast("Table already taken");
    refreshTables();
}