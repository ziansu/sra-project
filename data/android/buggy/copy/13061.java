@dagger.Provides
android.app.ProgressDialog provideMainPresenter() {
    android.app.ProgressDialog dialog = new android.app.ProgressDialog(activity, android.app.ProgressDialog.STYLE_SPINNER);
    dialog.setCancelable(false);
    dialog.setCanceledOnTouchOutside(false);
    return dialog;
}