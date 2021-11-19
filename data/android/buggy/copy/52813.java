public static org.apache.beam.sdk.metrics.MetricNameFilter named(java.lang.Class<?> namespace, java.lang.String name) {
    com.google.common.base.Preconditions.checkNotNull(namespace, "Must specify a inNamespace");
    com.google.common.base.Preconditions.checkNotNull(name, "Must specify a name");
    return new org.apache.beam.sdk.metrics.AutoValue_MetricNameFilter(namespace.getSimpleName(), name);
}