protected synchronized void cleanUp() {
    (com.jeremyfeltracco.core.simulations.Simulation.simsRunning)--;
    java.lang.System.out.println(("Sims: " + (com.jeremyfeltracco.core.simulations.Simulation.simsRunning)));
    synchronized(ea) {
        ea.notify();
    }
}