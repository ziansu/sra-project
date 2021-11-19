private void registeReceiver() {
    com.micrndemo.MainActivity.CompleteReceiver localReceiver = new com.micrndemo.MainActivity.CompleteReceiver();
    registerReceiver(localReceiver, new android.content.IntentFilter(android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE));
}