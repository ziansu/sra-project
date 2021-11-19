public final void setAuthCode(final java.lang.String authCode) throws java.io.IOException {
    if (org.apache.commons.lang.StringUtils.isBlank(authCode)) {
        setNewToken(null);
    }else {
        setNewToken(org.devfleet.crest.retrofit.AbstractCrestService.obtainFromAuth(this.login, authCode));
    }
}