private void generateButton() {
    if ((ComboBox.getSelectedIndex()) > 0) {
        GenerateReportButton.setEnabled(true);
    }else {
        GenerateReportButton.setEnabled(false);
    }
}