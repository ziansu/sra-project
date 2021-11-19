public void cleanup() {
    if ((context) != null) {
        handler.removeCallbacks(syntaxHighlightCallback);
        textBox.getText().clearSpans();
        textBox = null;
        context = null;
    }
}