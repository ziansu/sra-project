@java.lang.Override
public void handleError(java.lang.Exception exception) {
    io.github.tcdl.ResponderServer.LOG.debug("Received exception {}", exception);
    io.github.tcdl.Responder responder = new io.github.tcdl.Responder(messageOptions, null, msbContext);
    errorHandler(null, responder, exception);
}