public java.lang.String fetchAccessToken() throws com.paypal.base.rest.PayPalRESTException {
    java.lang.String accessToken = null;
    if ((this.credential) != null) {
        accessToken = this.credential.getAccessToken();
    }
    return accessToken;
}