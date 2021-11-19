@java.lang.Override
public void run() {
    while (!(threadEnabled)) {
        execute();
        try {
            java.lang.Thread.sleep(timerPolling);
        } catch (java.lang.InterruptedException e) {
            com.lewetechnologies.app.logger.Logger.e("CyclicalThread", "InterruptedException", e, Logger.SEVERE);
        }
    } 
}