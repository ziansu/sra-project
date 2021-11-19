private void setStyleToIndicateCommandFailure() {
    if (commandTextField.getStyleClass().contains(seedu.task.ui.CommandBox.ERROR_STYLE_CLASS)) {
        return ;
    }
    commandTextField.getStyleClass().add(seedu.task.ui.CommandBox.ERROR_STYLE_CLASS);
}