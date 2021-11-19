private void emitError(java.lang.String errorMessage) {
    eventEmitter.emitError(eventName, errorMessage, id);
}