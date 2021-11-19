public org.imagenarium.introspector.Introspector find(java.lang.String protocol) {
    return introspectorsMap.get(protocol.toUpperCase());
}