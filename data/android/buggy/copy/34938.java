private boolean isSetter(java.lang.reflect.Method method, java.lang.String fieldName) {
    return (method.getName().startsWith("set")) && (method.getName().endsWith(org.redisson.liveobject.core.AccessorInterceptor.getFieldNameSuffix(fieldName)));
}