private void handleColorPick() {
    drawView.setErase(false);
    drawView.setBrushSize(drawView.getLastBrushSize());
    openColorPickerDialog(false);
}