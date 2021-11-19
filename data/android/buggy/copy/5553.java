public void setSleepTime(int sleepTime_ms) {
    this.sleepTime_ms = sleepTime_ms;
    sleepTimeUsed = sleepTime_ms;
    dt = org.movsim.simulator.SimulationRunnable.DEFAULT_TIMESTEP_S;
    while ((sleepTimeUsed) > 40) {
        sleepTimeUsed /= 2;
        dt /= 2;
    } 
}