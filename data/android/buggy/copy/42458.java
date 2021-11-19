public void startOnAThread() {
    us.ihmc.tools.thread.ThreadTools.startAThread(this, "Simulation Contruction Set");
    while (this.isSimulationThreadUpAndRunning()) {
        java.lang.Thread.yield();
    } 
}