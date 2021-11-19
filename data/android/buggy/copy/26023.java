public boolean isOpen() throws tollbooth.TollboothException {
    if (this.unresponsiveMode) {
        throw new tollbooth.TollboothException("Gate is in unresponsive mode");
    }else {
        return controller.isOpen();
    }
}