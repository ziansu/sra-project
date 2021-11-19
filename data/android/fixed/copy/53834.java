public void stop() {
    if ((movieseek) != null) {
        synchronized(movieseek) {
            movieseek.stop = true;
            movieseek.interrupt();
            movieseek = null;
        }
    }
}