void putVertex(float x, float y, float z) {
    try {
        vertex.put(x).put(y).put(z);
    } catch (java.nio.BufferOverflowException e) {
    }
}