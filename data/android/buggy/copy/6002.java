@java.lang.Override
public void onError(java.lang.String error) {
    hideProgressDialog();
    android.widget.Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
}