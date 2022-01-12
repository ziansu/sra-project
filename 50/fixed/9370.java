public org.everit.jira.analytics.PiwikUrlBuilder addCustomDimesionSearcherValue(final java.lang.String searcherValue) {
    parameters.add((((searcherValueParam) + "=") + (encodeParamValue(searcherValue))));
    return this;
}