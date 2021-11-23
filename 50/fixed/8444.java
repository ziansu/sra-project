private static com.fasterxml.jackson.databind.ObjectMapper mapperFromJSONFactory(com.fasterxml.jackson.core.JsonFactory jsonFactory) {
    final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory);
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    mapper.findAndRegisterModules();
    return mapper;
}