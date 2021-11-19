public void setDirection(boolean directionToSet) {
    java.lang.System.out.println("Setting direction");
    if (directionToSet != (this.direction)) {
        degDone = java.lang.Math.abs((90 - (degDone)));
    }
    this.direction = directionToSet;
}