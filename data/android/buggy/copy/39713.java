@java.lang.Override
public void onReadyForSpeech(android.os.Bundle params) {
    android.util.Log.d(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, "onReadyForSpeech");
    m_listener.onBeginningOfSpeech();
}