private void log(java.lang.String message) {
    if ((logger) != null)
        logger.logMessage(message);
    else
        java.lang.System.out.println(message);
    
}