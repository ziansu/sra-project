private boolean validInput(android.view.View view) {
    android.widget.EditText editText = ((android.widget.EditText) (view.findViewById(R.id.price_tracking_input)));
    java.lang.String value = editText.toString();
    return value.matches("[0-9.]*");
}