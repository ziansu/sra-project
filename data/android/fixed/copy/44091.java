@java.lang.Override
public void onSkipToQueueItem(long queueId) {
    com.example.android.uamp.utils.LogHelper.d(com.example.android.uamp.playback.PlaybackManager.TAG, ("OnSkipToQueueItem:" + queueId));
    mQueueManager.setCurrentQueueItem(queueId);
    mQueueManager.updateMetadata();
}