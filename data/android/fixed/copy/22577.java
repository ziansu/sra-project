@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
private java.lang.String buildOAuthRedirectUrl() throws java.lang.NullPointerException {
    java.lang.String rootUrl = jenkins.model.Jenkins.getInstance().getRootUrl();
    if (rootUrl == null) {
        throw new java.lang.NullPointerException("Jenkins root url should not be null");
    }else {
        return rootUrl + "securityRealm/finishLogin";
    }
}