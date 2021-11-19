@java.lang.Override
public void start() {
    super.start();
    gyroTracker.start(0);
    raiseArm();
    state = 0;
}