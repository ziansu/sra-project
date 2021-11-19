@java.lang.Override
public void onDestroy() {
    if ((m_tts) != null) {
        m_tts.stop();
        m_tts.shutdown();
    }
    super.onDestroy();
}