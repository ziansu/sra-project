public void reset() throws tollbooth.TollboothException {
    this.actionDispatch(this.controller, tollbooth.TollGate.Action.RESET);
}