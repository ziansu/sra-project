public void signOut() {
    auth.signOut();
    com.facebook.login.LoginManager.getInstance().logOut();
}