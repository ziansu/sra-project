public void draw() {
    background(255);
    for (paths.Path p : paths) {
        drawPath(p);
    }
    u = ((u) + 0.005F) % 1.0F;
}