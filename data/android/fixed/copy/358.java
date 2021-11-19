public void run() {
    try {
        gH.initializationSequence(client);
        gH.clientLoop();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}