public boolean isLoadable(java.lang.String name) {
    boolean result = false;
    try {
        safeLoad(name);
        result = true;
    } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError ignored) {
        result = false;
    }
    return result;
}