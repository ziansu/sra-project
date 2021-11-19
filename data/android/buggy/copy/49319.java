@java.lang.Override
public void onResults(android.os.Bundle results) {
    android.util.Log.d(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, ("onResults " + results));
    java.util.List<java.lang.String> data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
    m_listener.onRecognitionDone(data);
}