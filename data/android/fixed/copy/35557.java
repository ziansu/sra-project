private java.lang.String getAccessToken() {
    com.bitlove.fetlife.model.pojos.Member currentUser = getFetLifeApplication().getUserSessionManager().getCurrentUser();
    if (currentUser == null) {
        return null;
    }
    return currentUser.getAccessToken();
}