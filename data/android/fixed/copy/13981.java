private void ableToType(final boolean trueOrFalse) {
    javafx.application.Platform.runLater(() -> {
        userText.setEditable(trueOrFalse);
    });
}