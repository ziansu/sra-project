public com.codahale.metrics.Histogram getOrCreateHistogram(java.lang.String metricName) {
    com.codahale.metrics.Histogram histogram = metrics.getHistograms().get(metricName);
    if (histogram == null) {
        histogram = createDefaultHistogram();
        metrics.register(metricName, histogram);
    }
    return histogram;
}