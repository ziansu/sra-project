public boolean damage(float damage, thisisxanderh.turrets.entities.Entity cause) {
    health -= damage;
    if ((health) <= 0) {
        die(cause);
        return true;
    }
    return false;
}