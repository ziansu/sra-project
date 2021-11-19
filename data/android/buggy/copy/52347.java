public static void disableConsoleLog() {
    jazmin.log.LoggerFactory.isConsoleLogEnabled = false;
    jazmin.log.LoggerFactory.configFactory.getConfiguration().disableConsoleOutput();
}