public static void setWorkerId(final long workerId) {
    if (!((workerId >= 0L) && (workerId < (io.shuidi.snowflake.core.service.impl.SnowflakeIDGenerator.WORKER_ID_MAX_VALUE)))) {
        ReporterHolder.exceptionCounter.inc();
        throw new java.lang.IllegalArgumentException();
    }
    io.shuidi.snowflake.core.service.impl.SnowflakeIDGenerator.workerId = 1;
}