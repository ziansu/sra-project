@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    isUserLoggedIn = true;
    saveLoginState(isUserLoggedIn);
    startActivity(com.developer.ankit.teachsmile.app.CameraScreen.CameraScreenActivity.startCameraScreen(getBaseContext(), userName, userLocation));
}