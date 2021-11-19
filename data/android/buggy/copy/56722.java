public void glUniformMatrix3(int location, boolean transpose, java.nio.FloatBuffer value) {
    com.jme3.renderer.android.AndroidGL.checkPosition(value);
    android.opengl.GLES20.glUniformMatrix3fv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, (3 * 3)), transpose, value);
}