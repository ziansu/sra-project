private void registeReceiver() {
    localReceiver = new com.micrndemo.MainActivity.CompleteReceiver();
    registerReceiver(localReceiver, new android.content.IntentFilter(android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE));
}