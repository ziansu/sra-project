private boolean isOutOfBounds_Down() {
    if ((robot.armMotor.getCurrentPosition()) > (min))
        return true;
    
    return false;
}