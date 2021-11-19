private java.lang.String getAccessToken() {
    com.bitlove.fetlife.model.pojos.Member currentUser = getFetLifeApplication().getUserSessionManager().getCurrentUser();
    return currentUser.getAccessToken();
}