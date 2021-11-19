private boolean shouldFetchStats(final com.comcast.cdn.traffic_control.traffic_monitor.config.Cache cache) {
    com.comcast.cdn.traffic_control.traffic_monitor.health.HealthDeterminer.AdminStatus adminStatus = HealthDeterminer.AdminStatus.valueOf(cache.getStatus());
    return (adminStatus != (AdminStatus.OFFLINE)) || (adminStatus == (AdminStatus.ONLINE));
}