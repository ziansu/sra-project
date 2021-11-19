protected void restart() {
    process.destroy();
    try {
        startServer(false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}