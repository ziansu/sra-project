@java.lang.Override
public void serialize(javax.naming.Name value, com.fasterxml.jackson.core.JsonGenerator jgen, com.fasterxml.jackson.databind.SerializerProvider provider) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    LOG.info("custom JsonSerializer<Name> is being used!");
    jgen.writeString(value.toString());
}