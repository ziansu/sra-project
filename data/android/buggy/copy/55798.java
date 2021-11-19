@io.github.robotpy.magicbot.sm.State(first = true)
public void driveForward() {
    if ((drivetrain.moveTo()) == true) {
        nextState("rotateTo");
    }
}