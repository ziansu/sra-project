private static boolean skipCTX(java.lang.Class c) {
    final java.lang.String className = c.getName();
    return (className.startsWith("java.lang.invoke.")) || (className.contains("$$Lambda$"));
}