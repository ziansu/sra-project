private boolean shouldCaptureTracing(org.apache.synapse.MessageContext synCtx) {
    java.lang.Boolean isCollectingTraces = ((java.lang.Boolean) (synCtx.getProperty(StatisticsConstants.FLOW_TRACE_IS_COLLECTED)));
    if (isCollectingTraces == null) {
        return false;
    }else {
        return isCollectingTraces;
    }
}