private void logException(java.util.logging.Level level, java.lang.Object pMessage, java.lang.Throwable pThrowable) {
    if (pThrowable != null) {
        logger.logException(level, pThrowable, pMessage.toString());
    }else {
        logger.log(level, pMessage);
    }
}