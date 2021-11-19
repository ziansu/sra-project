public void flushWorldRendering() {
    org.craft.client.render.OurCraft.printIfGLError("after rendering world");
    disableGLCap(org.craft.client.render.GL_DEPTH_TEST);
    switchToOrtho();
    shaderBatch.apply(0, getColorBuffer(), renderBuffer, this);
    enableGLCap(org.craft.client.render.GL_DEPTH_TEST);
    org.craft.client.render.OurCraft.printIfGLError("after post-processing world");
}