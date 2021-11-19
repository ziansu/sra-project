public void resizeUDFBuffer(int size) {
    assert (m_udfBuffer) != null;
    if (size > (m_udfBuffer.capacity())) {
        setupUDFBuffer(size);
        updateEEBufferPointers();
    }
    m_udfBuffer.clear();
}