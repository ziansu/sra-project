public void act() {
    (timeLeft)++;
    if ((timeLeft) == 100) {
        getWorld().removeObject(this);
    }
    setLocation(getX(), ((getY()) + 2));
}