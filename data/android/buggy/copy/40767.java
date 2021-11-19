public void closeConnection() {
    send("stop");
    keepRunning = false;
}