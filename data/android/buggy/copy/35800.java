public void free(int bufferIndex) {
    buffers[bufferIndex].free();
    availableBuffers.add(bufferIndex);
}