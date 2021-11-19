public void onClick(android.view.View v) {
    java.lang.System.out.println("Button clicked");
    java.lang.String loginString = loginTxt.getText().toString();
    _mClickListener.onLogInClick(loginString);
}