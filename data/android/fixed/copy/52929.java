private void sendPlaybackFinishedEvent(com.willblaschko.android.alexa.interfaces.AvsItem item) {
    if (item != null) {
        alexaManager.sendPlaybackFinishedEvent(item, requestCallback);
        android.util.Log.i(com.willblaschko.android.alexavoicelibrary.BaseActivity.TAG, "Sending SpeechFinishedEvent");
    }
}