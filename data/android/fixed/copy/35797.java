private void commandAreaFocusGained(java.awt.event.FocusEvent evt) {
    if (clearTextOnFocus) {
        commandArea.setText(null);
        clearTextOnFocus = false;
    }
}