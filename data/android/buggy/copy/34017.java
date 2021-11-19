public void updateText(java.lang.String newText) {
    android.util.Log.i("ContentView", ((("Calling update text for " + (name)) + " with value ") + (value)));
    value = newText;
    valueView.setText(value);
}