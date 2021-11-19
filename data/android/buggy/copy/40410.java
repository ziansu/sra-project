private org.terasology.rendering.assets.texture.Texture getTextureInstance(org.terasology.rendering.opengl.FBO.BaseFboBuffer buffer) {
    return this.getTextureBuffer(buffer.getIdentifier());
}