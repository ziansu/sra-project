public void onLoginFailed() {
    android.widget.Toast.makeText(getContext(), "Login failed", Toast.LENGTH_LONG).show();
    _loginButton.setEnabled(true);
}