@io.github.robotpy.magicbot.sm.State
public void rotateTo() {
    if ((drivetrain.rotateTo()) == true) {
        nextState("driveForwardAgain");
    }
}