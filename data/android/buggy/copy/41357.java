void update() {
    super.update();
    x -= 3;
    if ((x) <= (-20)) {
        isAlive = false;
    }
}