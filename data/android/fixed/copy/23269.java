@java.lang.Override
protected java.util.List<org.araqne.logstorage.Log> filter(java.util.List<org.araqne.logstorage.Log> logs) {
    if (logs.isEmpty())
        return logs;
    
    count += logs.size();
    tabletTask.setActualCount(count);
    return logs;
}