public static java.io.File getCredentialFile() {
    final java.lang.String homePath = java.lang.System.getProperty(AppOptions.PRIVATE_HOME_PATH);
    final java.lang.String credFilePath = com.civilizer.utils.FsUtil.getAbsolutePath(com.civilizer.security.UserDetailsService.CREDENTIAL_FILE, homePath);
    return new java.io.File(credFilePath);
}