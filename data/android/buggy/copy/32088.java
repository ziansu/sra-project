public synchronized void stop() {
    if (!(running))
        return ;
    
    running = false;
    try {
        thread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.System.exit(1);
}