public void submit(android.view.View v) {
    if (checkForm()) {
        android.widget.Toast.makeText(this, "Informaton saved to the database successfully.", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}