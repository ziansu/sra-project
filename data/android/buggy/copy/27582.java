private void attemptLogin() {
    if ((mAuthTask) != null) {
        return ;
    }else {
        dbAdapter.isUser();
        android.widget.Toast.makeText(this, "Login gia' effettuato", Toast.LENGTH_SHORT).show();
    }
    showProgress(true);
}