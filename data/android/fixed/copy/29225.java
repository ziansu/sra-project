private boolean validInput() {
    java.lang.String text = ((android.widget.EditText) (getView().findViewById(R.id.price_tracking_input))).getText().toString();
    return (text.length()) > 0;
}