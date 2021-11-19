public static void debug(java.lang.String traceId, java.lang.Exception exception) {
    org.gooru.insights.api.utils.InsightsLogger.logger.debug(((org.gooru.insights.api.utils.InsightsLogger.TRACE_ID) + traceId), exception);
}