protected void execute() {
    if ((Robot.arm.getPosition()) > (setPoint)) {
        Robot.arm.setSpeed(0.5);
    }else {
        isFinished = true;
    }
    Robot.arm.log();
}