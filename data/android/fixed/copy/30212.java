public void setDirection(boolean directionToSet) {
    if (directionToSet != (this.direction)) {
        degDone = java.lang.Math.abs((90 - (degDone)));
    }
    this.direction = directionToSet;
}