@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    goMainScreen();
    com.facebook.AccessToken accessToken;
    facebookLogin(loginResult);
}