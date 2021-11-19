private static java.lang.String getSchemaClassName(java.lang.Class<?> messageType) {
    return (messageType.getName().replace('.', '/')) + "Schema";
}