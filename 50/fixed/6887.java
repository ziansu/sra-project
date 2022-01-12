private void refreshInputMultiplexer() {
    if ((inputMultiplexer) != null) {
        inputMultiplexer.clear();
        inputMultiplexer.addProcessor(stage);
        inputMultiplexer.addProcessor(gameInputListener);
    }
}