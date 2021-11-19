public void SetMinAltitude(short a) {
    if (a >= 0) {
        throw new java.lang.IllegalStateException("a >= 0");
    }
    m_minAltitude = a;
}