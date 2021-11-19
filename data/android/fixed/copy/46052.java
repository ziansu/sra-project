private static java.io.File locateConfigurationFile(java.io.File applicationPath) {
    return new java.io.File(((applicationPath + (java.io.File.separator)) + (password.pwm.PwmConstants.DEFAULT_CONFIG_FILE_FILENAME)));
}