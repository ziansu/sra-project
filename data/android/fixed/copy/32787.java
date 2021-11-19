public java.lang.String getLength(android.widget.EditText length_input) {
    java.lang.String length = length_input.getText().toString();
    android.util.Log.i("LENGTH", length);
    return length;
}