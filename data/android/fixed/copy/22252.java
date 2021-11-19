public void begin() {
    org.usfirst.frc.team166.robot.subsystems.Claw.solenoid.get();
    if ((this.clawState) == (org.usfirst.frc.team166.robot.subsystems.Claw.ClawStates.close)) {
        open();
    }
}