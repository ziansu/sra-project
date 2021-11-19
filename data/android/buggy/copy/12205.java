public void move() {
    x -= moveSpeed;
    if ((x) < (0 - (width))) {
        x = (rand.nextInt(200)) + 1000;
    }
}