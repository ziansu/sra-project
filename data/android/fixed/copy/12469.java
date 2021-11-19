@java.lang.Override
protected void onCurrentAccessTokenChanged(com.facebook.AccessToken oldAccessToken, com.facebook.AccessToken newAccessToken) {
    if (newAccessToken == null) {
        com.kosbrother.mongmongwoo.Settings.clearAllUserData();
        listener.onFbLogout();
    }
}