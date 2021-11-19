private void updateText(int c) {
    current = c;
    videoNumberLabel.setText(java.lang.String.format("%d of %d", current, tapes.size()));
    updateButtons();
    updateFieldsWithInfo();
    updateModifyingButtons();
}