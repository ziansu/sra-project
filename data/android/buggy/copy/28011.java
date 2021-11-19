private void stopThread(org.apache.jmeter.threads.JMeterThread thrd, java.lang.Thread t, boolean interrupt) {
    thrd.stop();
    thrd.interrupt();
    if (interrupt) {
        if (t != null) {
            t.interrupt();
        }
    }
}