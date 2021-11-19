@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    etApiDialog = ((android.widget.EditText) (findViewById(R.id.et_api_dialog)));
    apiKey[0] = etApiDialog.getText().toString();
}