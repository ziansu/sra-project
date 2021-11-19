@java.lang.Override
public void onCreate(int width, int height, boolean contextLost) {
    android.opengl.GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    square = new com.yanbin.magiccube.Square();
}