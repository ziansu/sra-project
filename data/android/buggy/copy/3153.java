public void EndRender() {
    org.lwjgl.opengl.GL11.glPushMatrix();
    org.lwjgl.opengl.Display.update();
    glCanvas.paint(glCanvas.getGraphics());
}