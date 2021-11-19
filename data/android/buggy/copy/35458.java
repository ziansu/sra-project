public static void log(java.lang.Object o) {
    if (!(com.github.cypher.DebugLogger.ENABLED)) {
        java.lang.System.out.println(o.toString());
    }
}