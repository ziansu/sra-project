private EnumSchema.Builder buildEnumSchema() {
    org.json.JSONArray arr = ls.schemaJson.getJSONArray("enum");
    java.util.Set<java.lang.Object> possibleValues = com.google.common.collect.Sets.newHashSet(arr);
    return org.everit.json.schema.loader.EnumSchema.builder().possibleValues(possibleValues);
}