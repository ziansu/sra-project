private static com.fasterxml.jackson.databind.JsonNode toJson(java.lang.String object) {
    try {
        return com.redhat.lightblue.util.JsonUtils.json(object);
    } catch (java.lang.Exception e) {
        throw java.lang.Error.get(MetadataConstants.ERR_ILL_FORMED_METADATA, object.toString());
    }
}