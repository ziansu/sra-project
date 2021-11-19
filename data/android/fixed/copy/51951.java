public static java.lang.String reverseMapExternal(java.lang.Class<?> name) {
    return com.maxqia.ReflectionRemapper.Utils.reverseMap(name).replace('$', '.').replace('/', '.');
}