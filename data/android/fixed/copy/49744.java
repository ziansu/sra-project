@java.lang.Override
public void onPause() {
    getPersistenceManager().getDatabase().unregisterReceiptRowListener();
    super.onPause();
}