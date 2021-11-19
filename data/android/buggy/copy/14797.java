boolean validatePanel() {
    if ((copyImageCheckbox.isSelected()) && (!(imageWriterPathIsValid()))) {
        return false;
    }
    return enableNext;
}