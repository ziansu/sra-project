public void setState(final com.monits.agilefant.model.StateKey state, final boolean resetELIfDone) {
    this.state = state;
    if ((state == (StateKey.DONE)) && resetELIfDone) {
        this.effortLeft = 0;
    }
}