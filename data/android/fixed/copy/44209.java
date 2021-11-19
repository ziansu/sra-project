public static model.request.PiazzaJobRequest parseRequestJson(java.lang.String json) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.databind.JsonMappingException, java.io.IOException {
    return new com.fasterxml.jackson.databind.ObjectMapper().readValue(json, model.request.PiazzaJobRequest.class);
}