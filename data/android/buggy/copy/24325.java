public boolean isSignedIn() {
    try {
        com.stamps.web.print.postage.elements.labels.startinglabels.SignedInUserSpan signedInUserSpan = new com.stamps.web.print.postage.elements.labels.startinglabels.SignedInUserSpan(driver);
        return signedInUserSpan.isEnabled();
    } catch (java.lang.Exception e) {
        return false;
    }
}