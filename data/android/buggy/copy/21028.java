public void timeStep(double gravity) {
    positionY = (positionY) + (velocityY);
    positionX = (positionX) + (velocityX);
    velocityX = (velocityX) + gravity;
    ageOfObject = (ageOfObject) + 1;
}