@java.lang.Override
public void start() {
    gyroTracker.start(0);
    raiseArm();
    state = 0;
}