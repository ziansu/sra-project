private void showBrowser() {
    if (!(web.getUrl().contains("tas.fhict.nl/oob.html"))) {
        web.setVisibility(View.VISIBLE);
    }
}