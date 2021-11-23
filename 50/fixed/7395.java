public void maybeRegisterModule(com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
    if (springfox.documentation.swagger1.configuration.SwaggerJacksonModule.isModuleSetup(objectMapper)) {
        objectMapper.registerModule(this);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}