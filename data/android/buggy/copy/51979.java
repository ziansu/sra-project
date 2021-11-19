public static java.lang.String logInfo(java.lang.String format, java.lang.Object... args) {
    java.lang.String mes = util.Logger.getString("INFO", format, args);
    java.lang.System.err.println(mes);
    return mes;
}