public java.lang.String getLength(android.widget.EditText length_input) {
    java.lang.String length = length_input.getText().toString();
    android.widget.Toast.makeText(this, length, Toast.LENGTH_LONG).show();
    android.util.Log.i("LENGTH", length);
    return length;
}