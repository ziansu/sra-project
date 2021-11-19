public void damage(int damage) {
    this.health = -damage;
    if ((this.health) <= 0) {
        this.alive = false;
    }
}