@java.lang.Override
protected void onPreExecute() {
    mProgressDialog = new com.afollestad.materialdialogs.MaterialDialog.Builder(getContext()).content(R.string.loading).progress(true, 0).show();
}