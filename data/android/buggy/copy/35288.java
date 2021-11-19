public void run() {
    mUserProfile = payload;
    mFacade.updateUserProfile(mClient);
    updateFields();
}