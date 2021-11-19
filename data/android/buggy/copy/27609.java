public static void debug(java.lang.String message, int level) {
    if ((com.atlauncher.LogManager.showDebug) || ((com.atlauncher.LogManager.debugLevel) >= level)) {
        com.atlauncher.LogManager.queue.offer(new com.atlauncher.evnt.LogEvent(com.atlauncher.evnt.LogEvent.LogType.DEBUG, message));
    }
}