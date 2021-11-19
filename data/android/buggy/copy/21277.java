public void start() throws java.io.IOException {
    try {
        server.start();
        server.join();
    } catch (java.lang.Exception e) {
        throw new java.io.IOException("Unable to start Jetty server", e);
    }
}