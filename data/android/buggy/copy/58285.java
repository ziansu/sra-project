public void clearOldInput() {
    try {
        lastCountryClicked.getInputBanner().clearAll();
    } catch (java.lang.NullPointerException npe) {
        java.lang.System.out.println("Null");
    }
}