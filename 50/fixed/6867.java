private java.util.Properties getPropertiesFromJobConfiguration(gobblin.scheduler.JobConfiguration jobConfiguration) {
    java.util.Properties jobProps = new java.util.Properties();
    jobProps.putAll(getDefaultProperties());
    jobProps.putAll(org.apache.commons.configuration.ConfigurationConverter.getProperties(jobConfiguration));
    return jobProps;
}