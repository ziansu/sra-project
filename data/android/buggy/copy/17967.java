private synchronized void waitForThreads() {
    java.lang.System.out.println(Simulation.simsRunning);
    while ((com.jeremyfeltracco.core.simulations.Simulation.simsRunning) != 0) {
        try {
            wait();
            java.lang.System.out.println(Simulation.simsRunning);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}