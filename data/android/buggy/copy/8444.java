private static com.fasterxml.jackson.databind.ObjectMapper mapperFromJSONFactory(com.fasterxml.jackson.core.JsonFactory jsonFactory) {
    final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory);
    mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    mapper.findAndRegisterModules();
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    return mapper;
}