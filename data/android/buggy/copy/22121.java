@java.lang.Override
protected void onStart() {
    broadcastReceiver = new com.kiwi.flickrbatchdownload.photodetail.PhotoDetailAsyncTaskLoaderActivity.DownloadBroadcastReceiver();
    android.util.Log.d("Jane", "register Receiver");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.kiwi.flickrbatchdownload.download.DownloadService.IMAGE_TASKINFO_SENDBACK_ACTION));
    super.onStart();
}