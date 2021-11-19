public void run() {
    mUserProfile = payload;
    mFacade.updateUserProfile(payload);
    updateFields();
}