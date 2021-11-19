public java.lang.String getCurrentUserId() {
    com.google.firebase.auth.FirebaseUser user = getUser();
    java.lang.String uId = "";
    if (user != null) {
        uId = user.getUid();
    }else {
        signOut();
    }
    return uId;
}