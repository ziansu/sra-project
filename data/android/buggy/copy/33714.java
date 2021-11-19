@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(Constants.TAG, "In activity, oncompletelistener");
    if (!(task.isSuccessful())) {
        showLoginError("Authentication failed.");
    }
}