private long lowerBound(final java.util.Map.Entry<java.lang.Long, java.lang.Long> firstEntry) {
    return org.glassfish.jersey.server.internal.monitoring.AggregatingTrimmer.lowerBound(firstEntry.getKey(), java.util.concurrent.TimeUnit.NANOSECONDS.convert(startTime, startUnitTime), chunkSize, org.glassfish.jersey.server.internal.monitoring.ReservoirConstants.COLLISION_BUFFER_POWER);
}