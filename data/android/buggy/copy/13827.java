public void showEulaDialog() {
    clearDialogs();
    environment.getRouter().showWebViewDialog(this, getString(R.string.eula_file_link), getString(R.string.end_user_title));
}