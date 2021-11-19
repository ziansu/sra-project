public static java.lang.String getCustomTokenForUser(java.lang.Long userId) {
    if ((com.google.firebase.FirebaseApp.getApps().size()) == 0)
        com.pratilipi.common.util.FirebaseApi.initialiseFirebase();
    
    return com.google.firebase.auth.FirebaseAuth.getInstance().createCustomToken((userId + ""));
}