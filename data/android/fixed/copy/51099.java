private static java.lang.Object getInstance(java.lang.Class clazz) {
    try {
        return clazz.newInstance();
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        return null;
    }
}