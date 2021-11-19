protected void checkFlipToNext() {
    canFlipPage = validatePage();
    getContainer().updateButtons();
}