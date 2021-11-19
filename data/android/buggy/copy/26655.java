private void updateChatWindow(final java.lang.String text) {
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        public void run() {
            history.setEditable(true);
            history.appendText(text);
            history.setEditable(false);
        }
    });
}