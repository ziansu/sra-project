public void halt() {
    moving = false;
    velX = 0;
    velY = 0;
    accelX = 0;
    accelY = 0;
    x = destX;
    y = destY;
}