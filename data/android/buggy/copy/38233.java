private void isEnabled() {
    if ((settingsSupplier) == null) {
        throw new java.lang.IllegalStateException("Settings are nullified.");
    }
}