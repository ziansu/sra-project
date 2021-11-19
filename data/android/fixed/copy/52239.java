private void applyRule(final org.sonar.plugins.pitest.metrics.ResourceMutantMetrics resourceMetrics, final org.sonar.api.rules.ActiveRule rule, final org.sonar.api.batch.sensor.SensorContext context) {
    applyThresholdRule(resourceMetrics, rule, context);
    applyMutantRule(resourceMetrics, rule, context);
}