public void stop() {
    if (running) {
        internalRecorder.stop();
    }
    running = false;
}