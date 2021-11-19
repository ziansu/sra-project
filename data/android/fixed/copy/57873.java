private java.lang.String getJoinPointReturnType(final java.lang.String className) {
    java.lang.String returnType = null;
    final java.lang.String[] splittedClassName = className.split(" ");
    returnType = splittedClassName[0];
    return returnType;
}