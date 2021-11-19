@com.google.inject.Provides
@com.google.inject.Singleton
@com.google.inject.name.Named(value = "ValidationObjectMapper")
public com.fasterxml.jackson.databind.ObjectMapper getObjectMapper() {
    final com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    objectMapper.registerModule(new com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule());
    objectMapper.addMixInAnnotations(javax.xml.datatype.XMLGregorianCalendar.class, org.mockito.cglib.proxy.Mixin.class);
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return objectMapper;
}