@java.lang.Override
public void install() {
    self = org.nuxeo.ecm.core.management.jtajca.internal.DefaultMonitorComponent.bind(org.nuxeo.ecm.core.management.jtajca.CoreSessionMonitor.class, this);
    registry.register(com.codahale.metrics.MetricRegistry.name("nuxeo.repositories", "sessions"), new com.codahale.metrics.JmxAttributeGauge(self.getObjectName(), "Count"));
}