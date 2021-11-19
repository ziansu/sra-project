public io.specto.hoverfly.junit.rule.HoverflyRule printSimulationData() {
    if ((hoverflyMode) == (io.specto.hoverfly.junit.core.HoverflyMode.SIMULATE)) {
        enableSimulationPrint = true;
    }
    return this;
}