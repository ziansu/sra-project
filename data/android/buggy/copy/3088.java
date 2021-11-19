public void log(java.lang.String message) {
    logger.log(org.apache.log4j.Priority.INFO, message);
    server.broadcastLog(message);
}