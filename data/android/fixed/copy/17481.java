protected java.util.List<com.fasterxml.jackson.databind.JsonNode> parseValue(com.fasterxml.jackson.databind.JsonNode node) {
    com.fasterxml.jackson.databind.JsonNode path = node.path(org.n52.shared.sensorthings.decoder.VALUE);
    if (checkNode(path)) {
        return getNodes(path);
    }
    return getNodes(node);
}