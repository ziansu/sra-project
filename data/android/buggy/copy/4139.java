private void toggleListening(javafx.stage.Window window, boolean shouldListen) {
    if (shouldListen) {
        window.showingProperty().addListener(this::onAttachedWindowShow);
    }else {
        window.showingProperty().removeListener(this::onAttachedWindowShow);
    }
}