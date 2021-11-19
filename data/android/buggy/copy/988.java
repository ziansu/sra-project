public static boolean isReflectInvocation(java.lang.String className, java.lang.String methodName) {
    return (className.equals("java/lang/reflect/Method")) && (methodName.equals("invoke"));
}