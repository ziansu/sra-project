public void update() {
    deg += 10 * (dir);
    if (((deg) >= 90) || ((dir) <= 0)) {
        dir = 0;
    }
}