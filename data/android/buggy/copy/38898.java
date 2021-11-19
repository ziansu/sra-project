public void setRightDrive(double speed) {
    if (speed > 1) {
        speed = 1;
    }else
        if (speed < (-1)) {
            speed = -1;
        }
    
    org.usfirst.frc.team340.robot.subsystems.Drive.rightDrive.set((-speed));
}