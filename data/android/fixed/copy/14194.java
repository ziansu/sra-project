public void info(java.lang.String key, java.lang.Throwable e, java.lang.Object... args) {
    if (isInfoEnabled()) {
        actualLogger.info(getLocalizedMessage(key, args), e);
    }
}