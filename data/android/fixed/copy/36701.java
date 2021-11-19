public java.lang.String getSimulationSolver() {
    java.lang.String tag = getProperty(pt.uminho.ceb.biosystems.mew.core.cmd.searchtools.configuration.SimulationConfiguration.SIM_SOLVER, currentState, true);
    if (tag != null)
        return tag.toUpperCase();
    else
        return null;
    
}