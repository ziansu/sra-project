protected synchronized void cleanUp() {
    (com.jeremyfeltracco.core.simulations.Simulation.simsRunning)--;
    synchronized(ea) {
        ea.notify();
    }
}