public static void warn(final java.lang.String pattern, final java.lang.Object... arguments) {
    final java.lang.StackTraceElement ste = java.lang.Thread.currentThread().getStackTrace()[1];
    gargoyle.ct.Log._log(java.util.logging.Level.WARNING, null, pattern, ste, arguments);
}