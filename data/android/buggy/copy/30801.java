public void setSize(float width, float height) {
    this.width = width;
    this.height = height;
    rootComponent.setSize(width, height);
    renderer.setViewportSize(new com.badlogic.gdx.math.Vector2(width, height));
}