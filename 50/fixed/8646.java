@com.google.inject.Provides
@java.lang.Override
protected com.fasterxml.jackson.databind.ObjectMapper provideObjectMapper(@com.picdrop.guice.names.Config
java.util.Properties p) {
    return appModule.provideObjectMapper(p);
}