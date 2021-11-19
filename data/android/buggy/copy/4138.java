public ru.taskurotta.service.metrics.PeriodicMetric getPeriodicInstance(java.lang.String name, int periodSeconds) {
    int dataPointsCount = (TimeConstants.SECONDS_IN_24_HOURS) / (java.lang.Long.valueOf(periodSeconds).intValue());
    return new ru.taskurotta.service.metrics.PeriodicMetric(name, executorService, numberDataListener, periodSeconds, dataPointsCount);
}