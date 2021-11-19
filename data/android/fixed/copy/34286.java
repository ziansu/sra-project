public boolean dealDamage(int deltaDamageTaken) {
    this.damageTaken += deltaDamageTaken;
    return this.isDead();
}