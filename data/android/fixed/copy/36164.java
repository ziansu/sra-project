private void stopLED() {
    if ((m_Cam) != null) {
        m_Cam.stopPreview();
        m_Cam.release();
        m_Cam = null;
    }
}