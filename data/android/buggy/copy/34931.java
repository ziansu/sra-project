public void onClick(android.content.DialogInterface dialog, int whichButton) {
    valueEmail = authEmail.getText().toString();
    valuePassword = authPassword.getText().toString();
    dialog.dismiss();
    return ;
}