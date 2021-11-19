@java.lang.Override
public org.hawkular.inventory.api.model.Metric getMetric(java.lang.String environmentId, java.lang.String metricId) {
    return this.restApi().getMetric(environmentId, metricId);
}