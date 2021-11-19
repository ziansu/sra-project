@java.lang.Override
public void onNewFrame(com.google.vr.sdk.base.HeadTransform headTransform) {
    mDirectVideo = new com.diligimus.glcam.DirectVideo(texture);
    android.opengl.GLES20.glClearColor(1.0F, 0.0F, 0.0F, 0.0F);
}