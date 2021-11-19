public void stop() {
    setVisible(false);
    getSound().stop();
    createBounds(0, 0, 0, 0);
}