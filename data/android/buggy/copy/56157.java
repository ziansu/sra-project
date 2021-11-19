public void checkForRemoval(projectiles.Projectile p) {
    if (((ifOutOfBounds(p)) || (checkIfHitEnemies(p))) || ((p.getHealth()) == 0)) {
        notifyObservers(p, "remove");
    }
}