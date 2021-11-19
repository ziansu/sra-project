@java.lang.Override
public void onSuccess(com.facebook.share.Sharer.Result shareResult) {
    bringBackWebView();
    android.util.Log.i("Share Success", "Shared to facebook");
}