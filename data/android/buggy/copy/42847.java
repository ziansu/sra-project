@java.lang.Override
public void onError(com.facebook.FacebookException e) {
    bringBackWebView();
    android.util.Log.i("Error", "Error");
}