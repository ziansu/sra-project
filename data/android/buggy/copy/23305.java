public void close() {
    clearAll(indexChannel, indexBuffers);
    clearAll(dataChannel, dataBuffers);
}