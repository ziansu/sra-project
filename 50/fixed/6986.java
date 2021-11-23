public static org.libsmith.anvil.time.Stopwatch start() {
    return new org.libsmith.anvil.time.Stopwatch(null, org.libsmith.anvil.time.Stopwatch.DEFAULT_TIME_SOURCE.getTime(), org.libsmith.anvil.time.Stopwatch.DEFAULT_TIME_SOURCE);
}