@java.lang.Override
public void onSuccess() {
    android.content.Intent intent = new android.content.Intent(this, framgia.vn.framgiacrb.ui.activity.SplashActivity.class);
    getPlaceFromServer(Session.sAuthToken);
    startActivity(intent);
    finish();
}