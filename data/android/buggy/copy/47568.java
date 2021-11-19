public static java.lang.String getDatabaseFilePath() {
    return (java.lang.System.getProperty(AppOptions.DB_FILE_PREFIX)) + (java.lang.System.getProperty(AppOptions.DB_FILE_SUFFIX));
}