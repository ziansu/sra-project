private <T> T checkNotNull(final T arg, final java.lang.String message) {
    return null == arg ? this.<T>throwExportException(message) : arg;
}