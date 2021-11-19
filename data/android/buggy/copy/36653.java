public void login(android.view.View view) {
    switch (view.getId()) {
        case R.id.facebook :
            provider = com.microsoft.windowsazure.mobileservices.authentication.MobileServiceAuthenticationProvider.Facebook;
            break;
        case R.id.google :
            provider = com.microsoft.windowsazure.mobileservices.authentication.MobileServiceAuthenticationProvider.Google;
            break;
        default :
            break;
    }
    authenticate(false);
}