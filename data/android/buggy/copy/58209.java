public programminglife.model.drawing.XYCoordinate getCenter() {
    if (!(drawDimensionsUpToDate)) {
        setDrawDimensions();
    }
    return this.getLocation().add(this.getSize().multiply(0.5));
}