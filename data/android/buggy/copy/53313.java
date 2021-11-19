@java.lang.Override
public void onError(int error) {
    android.util.Log.e(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, ((("error " + error) + ": ") + (com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.getErrorText(error))));
    m_listener.onError(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.getErrorText(error));
}