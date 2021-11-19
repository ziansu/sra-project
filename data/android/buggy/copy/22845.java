@android.webkit.JavascriptInterface
public void stopRecording() {
    android.util.Log.e(org.innovationsforlearning.StudentPortal.MainActivity.TAG, "stop recording");
    audio.stopRecording();
    audio.startPlaying();
}