private void showZeroTasksFeedback() {
    javafx.scene.text.Text emptyDisplay = new javafx.scene.text.Text(urgenda.gui.DisplayController.MESSAGE_ZERO_TASKS);
    emptyDisplay.setFont(Main.BOLD_FONT);
    displayHolder.getChildren().add(emptyDisplay);
}