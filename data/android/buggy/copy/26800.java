public void turn30Degrees() {
    gyro.reset();
    while ((gyro.getAngle()) < 30) {
        double turningValue = 30 * 0.005;
        myRobot = $missing$;
    } 
}