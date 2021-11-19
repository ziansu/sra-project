public void setMaxHealth(int maxHealth) {
    if (maxHealth < 0) {
        maxHealth = 0;
    }
    this.maxHealth = maxHealth;
}