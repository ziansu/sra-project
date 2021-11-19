public void resizeUDFBuffer(int size) {
    assert (m_udfBuffer) != null;
    setupUDFBuffer(size);
    updateEEBufferPointers();
    m_udfBuffer.clear();
}