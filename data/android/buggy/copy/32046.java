public void close() throws tollbooth.TollboothException {
    if (!(this.controller.isOpen())) {
        return ;
    }
    this.actionDispatch(this.controller, tollbooth.TollGate.Action.CLOSE);
}