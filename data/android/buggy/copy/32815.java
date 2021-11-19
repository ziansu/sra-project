public void update() {
    turnObject();
    this.alt_pos_x = this.pos_x;
    this.alt_pos_y = this.pos_y;
    Player.position.setX(this.pos_x);
    Player.position.setY(this.pos_y);
}