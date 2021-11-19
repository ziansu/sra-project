protected java.lang.String processError(java.lang.String message, java.lang.Throwable thrown) {
    org.auraframework.impl.adapter.ServerErrorUtilAdapterImpl.logger.warn(message, thrown);
    return java.util.UUID.randomUUID().toString();
}