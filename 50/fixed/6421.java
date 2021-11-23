public void onClick(android.view.View v) {
    java.lang.String loginString = loginTxt.getText().toString();
    _mClickListener.onLogInClick(loginString);
}