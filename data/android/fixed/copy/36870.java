@java.lang.Override
public void run() {
    try {
        if ((timer) != null) {
            communication.connect(parameters);
            timer.cancel();
            timer = null;
        }
    } catch (java.lang.Exception ex) {
    }
}