private void initializeFirebase() {
    if ((mValueUserListener) == null) {
        mValueUserListener = createUserValueListener();
    }
    com.firebase.client.Firebase mRefUsers = new com.firebase.client.Firebase(com.ygorcesar.jamdroidfirechat.utils.ConstantsFirebase.FIREBASE_URL_USERS);
    mRefUsers.addValueEventListener(mValueUserListener);
}