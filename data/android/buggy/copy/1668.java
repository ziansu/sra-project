public synchronized void reportFailure(java.lang.String s) {
    m_loadFailure = true;
    reportNote(s);
}