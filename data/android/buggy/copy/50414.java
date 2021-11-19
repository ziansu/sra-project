public boolean isEagerProperty(java.lang.String propertyName) {
    java.lang.reflect.Method method = getRef().findPropertyAccessor(propertyName, ReflectionUtil.SETTER_PREFIX);
    return isAnnotationPresent(method, gengui.annotations.Eager.class);
}