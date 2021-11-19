private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object arg) {
    logger.print(level, org.slf4j.helpers.MessageFormatter.format(format, arg).getMessage(), null);
}