@java.lang.Override
protected void onPostExecute(final java.lang.Boolean success) {
    mAuthTask = null;
    showProgress(false);
    if (success) {
        finish();
    }else {
        mPasswordView.setError(getString(R.string.error_incorrect_password));
        mPasswordView.requestFocus();
    }
}