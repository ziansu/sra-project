public boolean damage(float damage) {
    health -= damage;
    if ((health) <= 0) {
        die();
        return true;
    }
    return false;
}