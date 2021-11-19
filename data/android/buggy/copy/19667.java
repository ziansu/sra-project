public void stopConThread() {
    runcon = false;
    try {
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        error = "Exception: " + (e.toString());
    }
}