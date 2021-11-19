private void displayErrorMessage(int errorMessageResource) {
    try {
        java.lang.String errorMessage = getString(R.string.error_loading_apod);
        previewImageView.setVisibility(View.GONE);
        errorMessageTextView.setText(errorMessage);
        errorMessageTextView.setVisibility(View.VISIBLE);
    } catch (java.lang.RuntimeException e) {
    }
}