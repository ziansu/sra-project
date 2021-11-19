public void startDebug() {
    java.util.List<java.lang.String> streams = org.wso2.siddhi.launcher.internal.EditorDataHolder.getDebugRuntime().getStreams();
    java.util.List<java.lang.String> queries = org.wso2.siddhi.launcher.internal.EditorDataHolder.getDebugRuntime().getQueries();
    org.wso2.siddhi.launcher.internal.EditorDataHolder.getDebugProcessorService().debug();
}