public void logError(java.lang.Throwable e, java.lang.String s, java.lang.Object... params) {
    logger.error((s == null ? "" : (MQ7PREFIX) + (java.text.MessageFormat.format(s, params))), e);
}