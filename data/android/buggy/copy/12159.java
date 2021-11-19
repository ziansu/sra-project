@java.lang.Override
public boolean start() {
    boolean started = super.start();
    if (started) {
        controller.open();
        controller.getState(null);
    }
    return started;
}