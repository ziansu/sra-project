public void suck() {
    java.lang.System.out.println(("suck(): setting speeds to " + (org.stlpriory.robotics.subsystems.ShooterSubsystem.SUCK_SPEED)));
    this.rightShooter.set((-(org.stlpriory.robotics.subsystems.ShooterSubsystem.SUCK_SPEED)));
    this.leftShooter.set(org.stlpriory.robotics.subsystems.ShooterSubsystem.SUCK_SPEED);
}