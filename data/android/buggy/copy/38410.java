public void cancel() {
    try {
        mmSocket.close();
    } catch (java.io.IOException e) {
    }
}