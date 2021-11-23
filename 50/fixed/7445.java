@javax.annotation.PreDestroy
public void unregisterFromJMX() {
    try {
        this.mBeanServer.unregisterMBean(this.objectName);
    } catch (final javax.management.JMException e) {
        throw new java.lang.IllegalStateException("Problem during unregistration of the profiling MBean", e);
    }
}