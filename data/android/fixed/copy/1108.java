private void doGLStuff() {
    org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    org.lwjgl.opengl.GL11.glDisable(GL11.GL_LIGHTING);
    org.lwjgl.opengl.GL11.glEnable(GL11.GL_BLEND);
    org.lwjgl.opengl.GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
}