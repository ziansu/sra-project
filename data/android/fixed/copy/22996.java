public void setWorkerId(final long workerId) {
    if (!((workerId >= 0L) && (workerId < (io.shuidi.snowflake.core.service.impl.SnowflakeIDGenerator.WORKER_ID_MAX_VALUE)))) {
        reporter.incr("exceptions");
        throw new java.lang.IllegalArgumentException();
    }
    io.shuidi.snowflake.core.service.impl.SnowflakeIDGenerator.workerId = 1;
}