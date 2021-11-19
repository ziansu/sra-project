private void sendPlaybackFinishedEvent(com.willblaschko.android.alexa.interfaces.AvsItem item) {
    alexaManager.sendPlaybackFinishedEvent(item, requestCallback);
    android.util.Log.i(com.willblaschko.android.alexavoicelibrary.BaseActivity.TAG, "Sending SpeechFinishedEvent");
}