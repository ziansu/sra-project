@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 unused, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
    viewX = 0.0F;
    viewY = 0.0F;
    fieldOfViewY = 120.0F;
    mLastTime = java.lang.System.currentTimeMillis();
    tick();
}