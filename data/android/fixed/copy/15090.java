public void reset() throws tollbooth.TollboothException {
    this.actionDispatch(controller, tollbooth.TollGate.Action.RESET);
}