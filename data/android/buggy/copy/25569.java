static final java.lang.String sanitize(java.lang.String input) {
    return org.zenoss.app.consumer.metric.impl.OpenTsdbWriter.INVALID_CHARS.matcher(input).replaceAll("-");
}