public util.Vector2D sub(util.Vector2D other) {
    this.x -= other.getX();
    this.y -= other.getY();
    return new util.Vector2D(this);
}