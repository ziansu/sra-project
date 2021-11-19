public static java.lang.Class<?> loadClass(android.content.Context context, java.lang.String str) throws java.lang.Exception {
    com.yalin.style.engine.classloader.WrapperClassLoader.init(context);
    try {
        return com.yalin.style.engine.classloader.WrapperClassLoader.classLoader.loadClass(str);
    } catch (java.lang.ClassNotFoundException e) {
        throw e;
    }
}