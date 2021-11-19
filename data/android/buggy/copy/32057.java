@java.lang.Override
public java.time.Year deserialize(com.fasterxml.jackson.core.JsonParser jsonParser, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException {
    return java.time.Year.parse(jsonParser.readValueAs(java.lang.String.class));
}