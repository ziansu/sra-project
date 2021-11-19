public void debug(java.lang.String message, java.lang.Object... params) {
    if (isDebugEnabled()) {
        log.debug(((prefix) + (java.lang.String.format(message, params))));
    }
}