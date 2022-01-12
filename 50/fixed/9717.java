public boolean getLeftTrigger() {
    return (gamepad.getRawAxis(Gamepad.Axes.LEFT_TRIGGER)) < (Constants.OI.triggerThreshhold);
}