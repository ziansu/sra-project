public double editTextToDouble(android.widget.EditText et) {
    double db;
    db = java.lang.Double.parseDouble(et.getText().toString().replace("$", ""));
    return db;
}