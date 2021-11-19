private java.lang.Class<?> resolveArray(java.lang.Class<?> clazz) {
    return clazz.isArray() ? resolveArray(clazz.getComponentType()) : clazz;
}