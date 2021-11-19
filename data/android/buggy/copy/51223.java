@java.lang.Override
protected void die() {
    java.lang.System.out.println(("splitting into" + (hitsLeft)));
    if (alive)
        splitAsteroid();
    
    super.die();
}