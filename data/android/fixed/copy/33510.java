@org.junit.Before
@org.junit.After
public void clearMetricRegistry() {
    org.stagemonitor.core.Stagemonitor.getMetric2Registry().removeMatching(MetricFilter.ALL);
}