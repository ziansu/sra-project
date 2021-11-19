@java.lang.Override
public com.thalesgroup.dtkit.metrics.model.InputMetric getInputMetric() {
    try {
        return com.thalesgroup.dtkit.metrics.model.InputMetricFactory.getInstance(org.jenkinsci.plugins.xunit.types.CheckInputMetric.class);
    } catch (com.thalesgroup.dtkit.metrics.model.InputMetricException e) {
        throw new java.lang.RuntimeException(("Can't create the inputMetric object for the class " + (org.jenkinsci.plugins.xunit.types.CheckInputMetric.class)));
    }
}