public void respawn(com.badlogic.gdx.math.Vector2 pos) {
    this.hp = 100;
    createBody();
    this.body.setTransform(pos, 0.0F);
    pc.setBody(this.body);
}