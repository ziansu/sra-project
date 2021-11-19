private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object arg1, java.lang.Object arg2) {
    logger.print(level, org.slf4j.helpers.MessageFormatter.format(format, arg1, arg2).getMessage(), null);
}