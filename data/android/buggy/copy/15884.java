public void move(int direction, int delta) {
    if (direction == 0) {
        position[1] += (speed) * delta;
        Weapon.cooldown -= delta;
    }
}