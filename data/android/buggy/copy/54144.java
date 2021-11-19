public static java.lang.Class<?> getClassForName(java.lang.String name) {
    try {
        return java.lang.Class.forName(name);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}