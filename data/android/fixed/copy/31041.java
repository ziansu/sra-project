public int join() throws java.io.IOException, java.lang.InterruptedException {
    try {
        return p.join();
    } finally {
        try {
            hudson.remoting.Channel.current().syncIO();
        } catch (java.lang.Throwable t) {
        }
    }
}