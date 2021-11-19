private org.osm2world.core.target.jogl.Cubemap captureCubemap(org.osm2world.core.math.VectorXYZ center) {
    int s = 400;
    org.osm2world.core.target.jogl.Framebuffer cubeBuffer = new org.osm2world.core.target.jogl.Framebuffer(javax.media.opengl.GL3.GL_TEXTURE_CUBE_MAP, s, s, true);
    cubeBuffer.init(gl);
    return captureCubemap(center, cubeBuffer);
}