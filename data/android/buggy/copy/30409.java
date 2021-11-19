@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
    mRender.setViewSize(width, height);
    android.opengl.GLES20.glViewport(0, 0, width, height);
    super.onSurfaceChanged(gl, width, height);
}