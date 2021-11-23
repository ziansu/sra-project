@java.lang.Override
public void onFailure(java.lang.Error error) {
    timber.log.Timber.e(error.getMessage());
    android.widget.Toast.makeText(this, error.getMessage(), Toast.LENGTH_LONG).show();
    setText(false, null);
}