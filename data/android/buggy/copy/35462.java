public static void main(java.lang.String[] args) {
    Logger.logLevel = Logger.ALL;
    Logger.logLevel = (Logger.ALL) & (~((Logger.WS_PARSE) | (Logger.WS_IO)));
    new jaws.Main();
}