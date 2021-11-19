public void setMovementDirection(int degrees) {
    this.movementDirection = ((int) (checkDegrees(degrees)));
    calculateMovement();
}