@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    mActivityHelper.dismissDialog();
    com.firebase.ui.auth.util.SmartlockUtil.saveCredentialOrFinish(this, com.firebase.ui.auth.ui.email.RegisterEmailActivity.RC_SAVE_CREDENTIAL, getIntent(), mActivityHelper.getFlowParams(), firebaseUser, password, null);
}