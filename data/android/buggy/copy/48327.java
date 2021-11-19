private boolean isNotArray(java.lang.reflect.Type type) {
    return !(((type instanceof java.lang.Class) && (((java.lang.Class) (type)).isArray())) || (type instanceof java.lang.reflect.GenericArrayType));
}