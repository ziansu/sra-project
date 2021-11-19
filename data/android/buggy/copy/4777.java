public static void meta(java.lang.String fileName, java.lang.String name, java.lang.String... args) {
    org.voltdb.utils.VoltTrace.s_tracer.queueEvent(new org.voltdb.utils.VoltTrace.TraceEvent(fileName, org.voltdb.utils.VoltTrace.TraceEventType.METADATA, null, null, null, args));
}