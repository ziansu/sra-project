public boolean close() {
    if (running) {
        running = false;
        connection.disconnect();
        return true;
    }else {
        return false;
    }
}