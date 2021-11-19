private <T> T checkNotNull(final T arg, final java.lang.String message) {
    return null == arg ? this.throwExportException(message, null) : arg;
}