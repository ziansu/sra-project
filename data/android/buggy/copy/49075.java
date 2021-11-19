private void updateDesiredHeight() {
    filteredDesiredCoMHeight.update();
    double zHeight = (fourFootSupportPolygon.getLowestFootStepZHeight()) + (filteredDesiredCoMHeight.getDoubleValue());
    desiredCoMPosition.setZ(zHeight);
}