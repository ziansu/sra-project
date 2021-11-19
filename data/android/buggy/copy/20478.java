private void shutDownTerminals() {
    if (uiPrefs_.showTerminalTab().getValue()) {
        uiPrefs_.showTerminalTab().setGlobalValue(false);
        uiPrefs_.writeUIPrefs();
    }
    view_.terminateAllTerminals();
}