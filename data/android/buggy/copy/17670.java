private static org.apache.logging.log4j.Level determineLoggingLevelToSet(java.lang.String className) {
    if (address.util.LoggerManager.specialLogLevel.containsKey(className)) {
        return address.util.LoggerManager.specialLogLevel.get(className);
    }
    return address.util.LoggerManager.currentLogLevel;
}