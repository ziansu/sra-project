public void setSendStartTimeMillis(java.lang.String server, long millis) {
    com.linkedin.pinot.transport.scattergather.ScatterGatherStats.PerServerStats perServerStats = _perServerStatsMap.get(server);
    if (perServerStats != null) {
        perServerStats.setSendStartTimeMillis(millis);
    }
}