@java.lang.Override
public void showAuthenticationUI(java.lang.String url, com.ge.predix.mobile.core.AuthHandlerCallback authHandlerCallback) {
    android.content.Intent intent = new android.content.Intent(parentActivity, predix.ge.com.referenceapplication.AuthenticationActivity.class);
    intent.putExtra("url", url);
    parentActivity.startActivityForResult(intent, 999);
    this.authHandlerCallback = authHandlerCallback;
}