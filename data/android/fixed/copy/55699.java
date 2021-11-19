@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    showProgress(false);
    android.widget.Toast.makeText(context, error.getMessage(), Toast.LENGTH_LONG).show();
    assignButton.setEnabled(false);
}