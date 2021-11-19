public void draw() {
    mesh.getShaderProgram().bind();
    texture.bind();
    mesh.draw();
}