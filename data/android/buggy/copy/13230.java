@java.lang.Override
public int index() {
    try {
        return java.util.Arrays.asList(this.recordGroup.getLocations()).hashCode();
    } catch (org.wso2.carbon.analytics.datasource.core.AnalyticsException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}