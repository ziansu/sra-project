public void maybeRegisterModule(com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
    if ((objectMapper.findMixInClassFor(io.swagger.models.Swagger.class)) == null) {
        objectMapper.registerModule(new springfox.documentation.swagger2.configuration.Swagger2JacksonModule());
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}