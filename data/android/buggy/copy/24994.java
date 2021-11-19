public net.wohlfart.pluto.roam.RoamTriangleBlueprint withColor(com.badlogic.gdx.graphics.Color color) {
    if ((textureFile) != null) {
        throw new java.lang.IllegalStateException("can't use color and texture in the same entity");
    }
    this.color.set(color);
    return withAttribute(new com.badlogic.gdx.graphics.VertexAttribute(com.badlogic.gdx.graphics.VertexAttributes.Usage.ColorUnpacked, 4, com.badlogic.gdx.graphics.glutils.ShaderProgram.COLOR_ATTRIBUTE));
}