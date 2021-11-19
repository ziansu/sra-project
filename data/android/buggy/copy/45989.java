protected static java.lang.Class getClass(java.lang.String classname) {
    try {
        return java.lang.Class.forName(classname);
    } catch (java.lang.Exception e) {
        return null;
    }
}