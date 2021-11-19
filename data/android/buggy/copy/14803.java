public final java.lang.ClassLoader getClassLoader() {
    if ((classLoader) == null) {
        createClassLoader();
    }
    return classLoader;
}