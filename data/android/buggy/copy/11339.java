protected java.nio.FloatBuffer storeMatrix(matrix.Matrix4f mat) {
    java.nio.FloatBuffer buf = org.lwjgl.BufferUtils.createFloatBuffer(16);
    mat.store(buf);
    buf.flip();
    return buf;
}