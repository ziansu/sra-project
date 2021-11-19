@java.lang.Override
public org.springframework.integration.json.JsonPropertyAccessor.WrappedJsonNode get(int index) {
    return org.springframework.integration.json.JsonPropertyAccessor.wrap(node.get(index));
}