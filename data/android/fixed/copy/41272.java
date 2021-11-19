@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(0.5F, 0.5F, 0.5F, 1.0F);
    mRand = new java.util.Random();
    mBoard = new org.no_ip.chrisbregg.simon.GameBoard();
}