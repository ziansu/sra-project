public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    if (importFromFile()) {
        android.content.Intent i = new android.content.Intent(this, com.DataFinancial.NoteJackal.MainActivity.class);
        startActivity(i);
    }
}