public synchronized boolean hasMoreChunks() throws java.io.IOException {
    if ((m_chunkReaderException) != null) {
        throw m_chunkReaderException;
    }
    return (m_hasMoreChunks) || (!(m_availableChunks.isEmpty()));
}