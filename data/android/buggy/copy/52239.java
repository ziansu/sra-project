private void applyRule(final org.sonar.plugins.pitest.metrics.ResourceMutantMetrics resourceMetrics, final org.sonar.api.rules.ActiveRule rule, final org.sonar.api.batch.sensor.SensorContext context) {
    if (applyThresholdRule(resourceMetrics, rule, context)) {
        return ;
    }
    applyMutantRule(resourceMetrics, rule, context);
}