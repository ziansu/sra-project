public void setLeftSpeedPercentage(double percentspeed) {
    leftFrontMotor.set((percentspeed * (org.usfirst.frc2619.SirLancebot2016.subsystems.DriveTrain.MAX_TICKS_PER_SECOND)));
}