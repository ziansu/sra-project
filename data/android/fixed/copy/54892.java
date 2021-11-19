protected void disarm() {
    Dungeon.level.disarmTrap(pos);
    active = false;
    if ((sprite) != null) {
        sprite.reset(this);
    }
}