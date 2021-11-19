public void setTextureBuffer(final java.nio.FloatBuffer textureBuffer) {
    textureBuffer.rewind();
    this.textureBuffer = com.ardor3d.util.geom.BufferUtils.clone(textureBuffer);
}