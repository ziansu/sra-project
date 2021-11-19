@java.lang.Override
public com.fasterxml.jackson.databind.ObjectMapper getContext(java.lang.Class<?> type) {
    return com.picdrop.json.JacksonConfigProvider.createMapper(this.config.getProperty("service.json.view"));
}