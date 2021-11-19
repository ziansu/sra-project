protected void scan(android.view.View v) {
    wifimanager.startScan();
    myadapter.notifyDataSetChanged();
}