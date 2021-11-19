public void applyStamina(int stamina) {
    int maxStamina = stats.getMaxStamina();
    this.stamina += stamina;
    if ((this.stamina) > maxStamina) {
        this.stamina = maxStamina;
    }
}