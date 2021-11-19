@java.lang.Override
public void onSuccess(com.google.firebase.auth.AuthResult authResult) {
    finish(com.firebase.ui.auth.ui.RESULT_OK, getIntent());
}