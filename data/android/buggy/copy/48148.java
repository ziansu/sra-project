@com.google.inject.Provides
@com.google.inject.Singleton
public com.fasterxml.jackson.databind.ObjectMapper providesObjectMapper(io.dropwizard.setup.Environment environment) {
    return environment.getObjectMapper();
}