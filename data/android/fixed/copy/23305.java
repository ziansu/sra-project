public void close() {
    try {
        clearAll(indexChannel, indexBuffers);
    } finally {
        clearAll(dataChannel, dataBuffers);
    }
}