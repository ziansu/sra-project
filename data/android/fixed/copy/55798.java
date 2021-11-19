@io.github.robotpy.magicbot.sm.State(first = true)
public void driveForward() {
    if ((drivetrain.moveTo(0)) == true) {
        nextState("rotateTo");
    }
}