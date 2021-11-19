public void onBackPressed() {
    if (!(menuExpander.handleBackPressed())) {
        super.onBackPressed();
    }
}