public void setButton(java.lang.String name, int buttonNum) {
    org.usfirst.frc.team2647.robot.Input.Button button = new org.usfirst.frc.team2647.robot.Input.Button(buttonNum, joystick_.getRawButton(buttonNum));
    buttons_.put(name, button);
}