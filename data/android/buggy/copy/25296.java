public static java.lang.String getRuntimeValidAppName(java.lang.String applicationName) {
    applicationName = applicationName.replaceAll("[^a-zA-Z0-9]+", "-");
    return applicationName;
}