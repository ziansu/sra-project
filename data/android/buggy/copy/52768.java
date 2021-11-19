public io.logz.log4j2.LogzioAppender.Builder setLogzioToken(java.lang.String logzioToken) {
    this.logzioToken = io.logz.log4j2.LogzioAppender.getValueFromSystemEnvironmentIfNeeded(logzioToken);
    return this;
}