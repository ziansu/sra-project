public java.lang.String getBadgeUrl() {
    return (getUrlName()) == (AllureReportPlugin.URL_PATH) ? ((getRootUrl()) + (getBuildUrl())) + (getUrlName()) : getUrlName();
}