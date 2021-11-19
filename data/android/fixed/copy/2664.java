public static boolean isLoggedIn() {
    com.facebook.AccessToken token = com.facebook.AccessToken.getCurrentAccessToken();
    if ((token != null) && (!(token.getToken().isEmpty())))
        return true;
    
    return false;
}