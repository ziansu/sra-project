@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(getApplicationContext(), "Password successfully changed", Toast.LENGTH_LONG).show();
    changePDialog.cancel();
}