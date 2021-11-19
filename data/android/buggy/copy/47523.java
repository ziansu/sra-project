private void removeLoadingSpinner() {
    if ((jsonFetcher.isTesting()) == false) {
        if (((loadingSpinner) != null) && (loadingSpinner.isShowing())) {
            loadingSpinner.dismiss();
        }
    }
}