public com.codahale.metrics.Histogram getOrCreateHistogram(java.lang.String metricName) {
    com.codahale.metrics.Histogram histogram = metrics.getHistograms().get(metricName);
    if (histogram == null) {
        metrics.register(metricName, createDefaultHistogram());
    }
    return histogram;
}