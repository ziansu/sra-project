public void logout(android.view.View view) {
    com.facebook.login.LoginManager.getInstance().logOut();
    android.content.Intent login = new android.content.Intent(this, com.example.friends.fitfriend.LoginActivity.class);
    startActivity(login);
    this.finish();
}