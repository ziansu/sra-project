private void onAuthGPlusSuccess(com.google.firebase.auth.FirebaseUser user) {
    android.util.Log.d(com.task.vasskob.firebase.ui.SignInActivity.TAG, ("onAuthGPlusSuccess UserName = " + (user.getEmail())));
    com.task.vasskob.firebase.model.User newUser = new com.task.vasskob.firebase.model.User(username, userEmail);
    com.task.vasskob.firebase.database.FirebaseOperations.CreateNewUser(newUser);
}