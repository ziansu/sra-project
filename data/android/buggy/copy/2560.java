@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(100);
        server.terminate(clientId);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}