public void draw() {
    mesh.getShaderProgram().bind();
    texture.bind(0);
    mesh.draw();
    time.api.gfx.texture.Texture.unbind(0);
}