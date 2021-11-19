public void tick() {
    if ((lastReplenishTime) < ((java.lang.System.currentTimeMillis()) - ((stats.getStaminaRefillRate()) * 1000))) {
        lastReplenishTime = java.lang.System.currentTimeMillis();
        applyStamina(1);
    }
}