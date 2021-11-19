private boolean responseHasProperty() throws java.lang.Exception {
    if (webPageSource.contains(wantedParameter)) {
        return true;
    }else {
        return false;
    }
}