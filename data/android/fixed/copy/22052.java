public void clearButtonClick(android.view.View view) {
    infoFragment.enableClearButton(false);
    localDatabase.clearLocalDatabase();
    infoFragment.enableSyncButton(true);
}