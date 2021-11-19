public static void endDuration(java.lang.String fileName, java.lang.String name, java.lang.String category, java.lang.String... args) {
    org.voltdb.utils.VoltTrace.s_tracer.queueEvent(new org.voltdb.utils.VoltTrace.TraceEvent(fileName, org.voltdb.utils.VoltTrace.TraceEventType.DURATION_END, name, category, null, args));
}