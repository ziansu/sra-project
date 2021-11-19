@java.lang.Override
public void call(java.lang.Throwable error) {
    org.freeshr.interfaces.encounter.ws.EncounterController.logger.error(error.getMessage());
    deferredResult.setErrorResult(error);
}