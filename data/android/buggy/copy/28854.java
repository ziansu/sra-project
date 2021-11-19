private void connectSimModel(thesis.core.SimModel simModel) {
    simPanel.connectSimModel(simModel, actions);
    uavViewPan.connectSimModel(simModel, simPanel);
    simTimer.connectSimRunner(simRunner);
}