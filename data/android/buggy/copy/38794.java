public void run() {
    mUserProfile = payload;
    com.goat.thirsty_goat.models.User.updateUserSingleton(mClient);
    updateFields();
}