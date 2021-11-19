private void updateAndRender(long deltaMilis) {
    currentState.update((deltaMilis / 1000.0F));
    prepareGameImage();
    currentState.render(gameImage.getGraphics());
    repaint();
    renderGameImage(getGraphics());
}