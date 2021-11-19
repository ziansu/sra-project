public boolean isRunning() {
    for (int i = 0; i < (threads.length); i++) {
        if (threads[i].isAlive()) {
            return true;
        }
    }
    return false;
}