public void drawCanvas(double width, double height) {
    grid.data = null;
    grid.redraw(viewerPane, showGridNumbersCheckBox.isSelected(), showGridLinesCheckBox.isSelected(), false);
}