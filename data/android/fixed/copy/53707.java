private <T> T throwExportException(final java.lang.String message, java.lang.Throwable t) {
    throw new java.lang.RuntimeException(com.google.common.base.Strings.nullToEmpty(message), t);
}