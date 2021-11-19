private java.lang.Class<?> resolveArray(java.lang.Class<?> clazz) {
    if (clazz.isArray()) {
        return resolveArray(clazz.getComponentType());
    }else {
        return clazz;
    }
}