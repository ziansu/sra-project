public void canvasInit(com.jogamp.opengl.GL2 gl) {
    gl.glClearColor(0.5F, 0.2F, 0.5F, 0.0F);
    ticker.start();
    selectView(SCREEN_MESH_VIEW);
}