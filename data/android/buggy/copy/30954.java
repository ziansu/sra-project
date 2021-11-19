public void login(java.lang.String pw, java.lang.String email) {
    findViewById(R.id.login_progress).setVisibility(View.VISIBLE);
    new onl.deepspace.wgs.LoginActivity.GetUserData(this).execute(pw, email);
}