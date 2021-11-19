public static java.lang.String getCustomTokenForUser(java.lang.Long userId) {
    com.pratilipi.common.util.FirebaseApi.initialiseFirebase();
    return com.google.firebase.auth.FirebaseAuth.getInstance().createCustomToken(userId.toString());
}