public static void log(org.slf4j.Logger logger, org.apache.cassandra.utils.NoSpamLogger.Level level, long minInterval, java.util.concurrent.TimeUnit unit, java.lang.String message, java.lang.Object... objects) {
    org.apache.cassandra.utils.NoSpamLogger.log(logger, level, minInterval, unit, org.apache.cassandra.utils.NoSpamLogger.CLOCK.nanoTime(), message, objects);
}