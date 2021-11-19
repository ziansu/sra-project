java.lang.String getProcessedURI(com.groupeseb.kite.CreationLog creationLog) {
    return creationLog.processPlaceholders(getName(), getUri());
}