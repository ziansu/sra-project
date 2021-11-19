public void move() {
    xPos += vx;
    yPos += vy;
    Point.multiMove(vx, vy, north, east, south, west);
}