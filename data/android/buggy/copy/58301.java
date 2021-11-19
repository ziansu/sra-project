public static com.fasterxml.jackson.databind.JsonNode createSingletonJSONNode(java.lang.String key, com.fasterxml.jackson.databind.JsonNode value) {
    final com.fasterxml.jackson.databind.node.ObjectNode jsonNodes = JsonNodeFactory.instance.objectNode();
    jsonNodes.put(key, value);
    return jsonNodes;
}