public com.codahale.metrics.Metric registerMetric(java.lang.String name, com.codahale.metrics.Metric metric) {
    if ((connectorApp) == null) {
        return null;
    }
    return connectorApp.registerMetric(name, metric);
}