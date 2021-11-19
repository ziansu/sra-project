@java.lang.Override
public org.hawkular.inventory.api.model.Metric getMetric(org.hawkular.inventory.api.model.Metric metric) {
    return this.restApi().getMetric(metric.getEnvironmentId(), metric.getFeedId(), metric.getId());
}