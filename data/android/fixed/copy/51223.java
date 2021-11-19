@java.lang.Override
protected void die() {
    if ((alive) && ((hitsLeft) > 1))
        splitAsteroid();
    
    super.die();
}