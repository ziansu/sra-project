void enableJMX(boolean jmx) {
    jmxEnabled = jmx;
    if (jmx) {
        org.easybatch.core.util.Utils.registerJmxMBean(report);
    }
}