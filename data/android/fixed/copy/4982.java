public int getHeight() {
    return ((int) (titleTextView.getText().toString().trim().isEmpty() ? 0 : getOriginalHeight()));
}