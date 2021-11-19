@com.facebook.react.bridge.ReactMethod
public void setAudioOutput(java.lang.String output) {
    android.media.AudioManager audioManager = ((android.media.AudioManager) (mReactContext.getSystemService(Context.AUDIO_SERVICE)));
    audioManager.setMode(AudioManager.MODE_IN_CALL);
    audioManager.setSpeakerphoneOn(output.equals("speaker"));
}