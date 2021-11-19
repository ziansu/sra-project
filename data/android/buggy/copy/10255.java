public void setClimb(boolean climb) {
    this.climb = climb;
    if (climb)
        motor.set(((speed) * (speedCoeff)));
    else
        motor.set(0);
    
}