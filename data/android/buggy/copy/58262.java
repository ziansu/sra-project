private boolean isMegaSlot(shuffle.fwk.data.simulation.SimulationTask task) {
    shuffle.fwk.data.Species s = task.getEffectSpecies(getCoords());
    return task.getState().getCore().getMegaSlot().equals(s);
}