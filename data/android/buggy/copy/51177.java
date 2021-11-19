private static java.lang.String newFile() {
    com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_NAME = (com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_PREFIX) + (com.fournodes.ud.locationtest.utils.FileLogger.df.format(com.fournodes.ud.locationtest.utils.FileLogger.c.getTime()));
    return (com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_NAME) + (com.fournodes.ud.locationtest.utils.FileLogger.LOG_FILE_EXT);
}