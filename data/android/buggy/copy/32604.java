public void run() {
    try {
        keyThread.sleep(timeSensitiveness);
        updateMovement();
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println(("------ Key thread interrupted -------\n" + e));
    }
}