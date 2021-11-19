public boolean canSetToStopped() {
    return ((inExecutionPhase()) && ((this) != (li.strolch.model.State.EXECUTED))) && ((this) != (li.strolch.model.State.STOPPED));
}