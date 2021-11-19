@java.lang.Override
protected void onCurrentAccessTokenChanged(com.facebook.AccessToken oldAccessToken, com.facebook.AccessToken currentAccessToken) {
    if (!(oldAccessToken.equals(currentAccessToken))) {
        com.facebook.AccessToken.setCurrentAccessToken(currentAccessToken);
    }
}