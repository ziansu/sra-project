@java.lang.Override
public void cleanup() {
    for (julietgroupproject.SimulationData sim : this.simulationQueue) {
        sim.terminate();
    }
    if ((this.trainer) != null) {
        this.trainer.terminateTraining(slaves);
    }
}