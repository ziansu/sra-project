private void showInitialIntent(boolean isVisible) {
    editableIntent = cloneIntent(this.originalIntent);
    editableIntent.setComponent(null);
    setupVariables();
    setupTextWatchers();
    showAllIntentData(null);
    showResetIntentButton(isVisible);
}