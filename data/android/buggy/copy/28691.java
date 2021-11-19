@java.lang.Override
protected void onDestroy() {
    syncTimerTask.cancel();
    com.gh0u1l5.g_protector.HistoryOperator HistoryDatabaseHelper = com.gh0u1l5.g_protector.HistoryOperator.getInstance(this);
    HistoryDatabaseHelper.close();
    super.onDestroy();
}