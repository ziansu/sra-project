protected java.lang.Class<?> existClass(java.lang.String classFullName) {
    try {
        return java.lang.Class.forName(classFullName);
    } catch (java.lang.ClassNotFoundException e) {
        return null;
    }
}