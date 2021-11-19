public static com.utilsplus.logging.PLogger getLoggerForClass(java.lang.Class<?> c) {
    com.utilsplus.logging.LoggingConfigurator.printAll();
    return new com.utilsplus.logging.PLogger(c);
}