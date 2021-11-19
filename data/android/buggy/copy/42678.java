public void info(java.lang.String key, java.lang.Object... args) {
    if (isInfoEnabled()) {
        actualLogger.error(getLocalizedMessage(key, args));
    }
}