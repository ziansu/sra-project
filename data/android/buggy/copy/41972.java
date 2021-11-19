public boolean containsMetric(com.yammer.metrics.core.MetricName originalName) {
    for (com.turn.kafka.metrics.MetricInfo mi : metrics) {
        if (mi.equals(originalName))
            return true;
        
    }
    return false;
}