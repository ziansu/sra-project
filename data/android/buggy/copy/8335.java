public void changeSpeedBy(double amount) {
    if ((((speed) + amount) <= 4) || (((speed) + amount) >= 0)) {
        this.speed = (speed) + amount;
    }
}