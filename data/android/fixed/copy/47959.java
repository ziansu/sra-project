private void generateButton() {
    if ((ComboBox.getSelectedIndex()) > (-1)) {
        GenerateReportButton.setEnabled(true);
    }else {
        GenerateReportButton.setEnabled(false);
    }
}