private java.util.Map<java.lang.String, java.lang.String> getMetricsContext() {
    return com.google.common.collect.ImmutableMap.of(Constants.Metrics.Tag.COMPONENT, Constants.Gateway.METRICS_CONTEXT, Constants.Metrics.Tag.HANDLER, Constants.Gateway.STREAM_HANDLER_NAME, Constants.Metrics.Tag.INSTANCE_ID, cConf.get(Constants.Stream.CONTAINER_INSTANCE_ID, "0"));
}