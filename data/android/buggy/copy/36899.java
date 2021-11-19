@java.lang.Override
public void joystickMoved(float x, float y) {
    float heading = computeHeading();
    sendMove(heading);
}