public void start() {
    progress.start();
    resultReaderThread.start();
    startOutputStreamMonitoring();
}