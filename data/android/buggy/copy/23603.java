private void refresh() {
    if (touched) {
        finish();
        startActivity(getIntent());
    }
    touched = false;
}