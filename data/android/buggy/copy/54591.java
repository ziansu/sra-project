@java.lang.Override
public long step() {
    currentExperiment.getController().userStep();
    currentExperiment.getAgent().getSimulation().step(this.getScope());
    return (currentStep)++;
}