private void setupView() {
    setContentView(R.layout.activity_login);
    setOnClickListeners(R.id.loginCreateAccountBtn, R.id.loginForgotPaswordBtn, R.id.loginSignInBtn);
    remember = ((android.widget.CheckBox) (findViewById(R.id.loginRemember)));
}