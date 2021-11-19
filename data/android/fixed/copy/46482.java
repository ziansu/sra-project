@com.google.inject.Provides
@com.google.inject.Singleton
public com.sun.jersey.api.client.WebResource provideClient() {
    return cfg.api.newApiClient();
}