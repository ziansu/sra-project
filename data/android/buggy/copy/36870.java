@java.lang.Override
public void run() {
    try {
        communication.connect(parameters);
        timer.cancel();
        timer = null;
    } catch (java.lang.Exception ex) {
    }
}