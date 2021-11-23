public boolean isInitialRestMode() {
    return ((this.getCurrentActivity()) == (Activity.REST)) && (((this.restHitpoints) + (this.restStamina)) < 1.0);
}