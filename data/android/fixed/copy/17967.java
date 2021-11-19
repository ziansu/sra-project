private synchronized void waitForThreads() {
    while ((com.jeremyfeltracco.core.simulations.Simulation.simsRunning) != 0) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}