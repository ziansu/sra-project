@java.lang.Override
protected void end() {
    org.usfirst.frc2832.Robot_2016.Kicker.resetAfterLaunch();
    if ((java.lang.Math.abs(((org.usfirst.frc2832.Robot_2016.Kicker.getAngle()) - (org.usfirst.frc2832.Robot_2016.commands.Shoot.startAngle)))) > (org.usfirst.frc2832.Robot_2016.commands.Shoot.ANGLE_TOLERANCE))
        org.usfirst.frc2832.Robot_2016.Kicker.reset();
    
}