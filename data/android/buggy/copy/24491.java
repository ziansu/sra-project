@java.lang.Override
public boolean isActive(org.stagemonitor.requestmonitor.reporter.IsActiveArguments isActiveArguments) {
    final boolean urlAvailable = !(corePlugin.getElasticsearchUrls().isEmpty());
    final boolean logOnly = requestMonitorPlugin.isOnlyLogElasticsearchRequestTraceReports();
    return urlAvailable || logOnly;
}