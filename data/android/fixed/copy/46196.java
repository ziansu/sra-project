private static java.lang.Object instantiate(java.lang.reflect.Constructor<?> constructor, java.lang.Object... arguments) {
    try {
        return constructor.newInstance(arguments);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}