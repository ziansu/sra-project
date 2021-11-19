public void stop() {
    try {
        sshServer.stop();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}