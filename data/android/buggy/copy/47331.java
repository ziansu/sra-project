@java.lang.Override
public void initialize(io.dropwizard.setup.Bootstrap<nl.esciencecenter.ahn.pointcloud.ViewerConfiguration> bootstrap) {
    bootstrap.setConfigurationSourceProvider(new io.dropwizard.configuration.SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(), new io.dropwizard.configuration.EnvironmentVariableSubstitutor()));
}