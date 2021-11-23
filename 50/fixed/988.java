public static boolean isReflectInvocation(java.lang.String className, java.lang.String methodName) {
    return (((className != null) && (className.equals("java/lang/reflect/Method"))) && (methodName != null)) && (methodName.equals("invoke"));
}