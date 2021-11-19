final void updateOKStatus() {
    boolean regexStatus = validateRegex();
    getContainer().setPerformActionEnabled(regexStatus);
}