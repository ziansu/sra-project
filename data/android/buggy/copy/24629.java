public void setMovementDirection(int degrees) {
    if (degrees >= 0) {
        this.movementDirection = ((int) (checkDegrees(degrees)));
        calculateMovement();
    }
}