public void showPage(java.lang.String url) {
    java.net.URL valid = myModel.go(url);
    if (valid != null) {
        update(valid);
    }else {
        showError(("Could not load " + url));
    }
}