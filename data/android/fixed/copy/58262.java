private boolean isMegaSlot(shuffle.fwk.data.simulation.SimulationTask task) {
    shuffle.fwk.data.Species s = task.getEffectSpecies(getCoords());
    return s.equals(task.getState().getCore().getMegaSlot());
}