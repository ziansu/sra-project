@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.firebase.ui.auth.ui.email.SignInActivity.RC_CREDENTIAL_SAVE)) {
        finish(com.firebase.ui.auth.ui.email.RESULT_OK, data);
    }
}