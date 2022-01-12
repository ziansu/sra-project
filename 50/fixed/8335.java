public void changeSpeedBy(double amount) {
    if ((((speed) + amount) <= 4) || (((speed) + amount) >= 1)) {
        this.speed = (speed) + amount;
    }
}