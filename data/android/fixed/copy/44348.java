@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    callbackManager.onActivityResult(requestCode, resultCode, data);
    if (callbackManager.onActivityResult(requestCode, resultCode, data)) {
        return ;
    }
}