public void timeStep(double gravity) {
    positionY = (positionY) + (velocityY);
    positionX = (positionX) + (velocityX);
    velocityY = (velocityY) + gravity;
    ageOfObject = (ageOfObject) + 1;
}