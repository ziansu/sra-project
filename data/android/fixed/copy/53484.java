private void sendPlaybackNearlyFinishedEvent(com.willblaschko.android.alexa.interfaces.AvsItem item, long offsetInMilliseconds) {
    if (item != null) {
        alexaManager.sendPlaybackNearlyFinishedEvent(item, offsetInMilliseconds, requestCallback);
        android.util.Log.i(com.willblaschko.android.alexavoicelibrary.BaseActivity.TAG, "Sending PlaybackNearlyFinishedEvent");
    }
}