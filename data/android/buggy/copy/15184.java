public void onClick(android.content.DialogInterface dialog, int i) {
    dialog.cancel();
    android.widget.Toast.makeText(getApplicationContext(), ((claim.getStatus()) + " claims cannot be edited."), Toast.LENGTH_SHORT).show();
}