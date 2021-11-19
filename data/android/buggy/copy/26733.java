public org.redisson.RedisRunner clientOutputBufferLimit$Slave(java.lang.String hardLimit, java.lang.String softLimit, long softSeconds) {
    addConfigOption(org.redisson.RedisRunner.REDIS_OPTIONS.CLIENT_OUTPUT_BUFFER_LIMIT$SLAVE, hardLimit, softLimit, ("" + softSeconds));
    return this;
}