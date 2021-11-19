@com.google.inject.Provides
@com.google.inject.Inject
public com.sun.jersey.api.client.WebResource provideClient(org.gbif.occurrence.processor.guice.ProcessorConfiguration cfg) {
    return cfg.api.newApiClient();
}