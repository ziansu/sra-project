public boolean isInitialRestMode() {
    return ((this.getCurrentActivity()) == (Activity.REST)) && (((this.restHitpoints) < 1.0) || ((this.restStamina) < 1.0));
}