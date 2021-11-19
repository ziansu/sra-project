private void setViewport() {
    if ((totalPoints) > (maxNumberOfPoints)) {
        final lecho.lib.hellocharts.model.Viewport viewport = new lecho.lib.hellocharts.model.Viewport(mChart.getMaximumViewport());
        viewport.left = (totalPoints) - (maxNumberOfPoints);
        mChart.setCurrentViewport(viewport);
    }
}