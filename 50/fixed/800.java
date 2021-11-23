public org.slf4j.Logger getLogger(java.lang.String name) {
    synchronized(loggerNameList) {
        loggerNameList.add(name);
    }
    return NOPLogger.NOP_LOGGER;
}