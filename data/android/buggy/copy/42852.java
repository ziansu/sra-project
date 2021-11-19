public void cleanup() {
    handler.removeCallbacks(syntaxHighlightCallback);
    textBox.getText().clearSpans();
    textBox = null;
    context = null;
}