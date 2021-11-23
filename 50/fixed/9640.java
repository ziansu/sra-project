private static void logAndAppend(java.lang.StringBuilder sb, java.lang.String str) {
    com.liveramp.cascading_ext.flow.LoggingFlow.LOG.info(str);
    sb.append(str).append("\n");
}