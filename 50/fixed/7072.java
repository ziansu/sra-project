public void initializeColorPickers() {
    for (int i = 0; i < (tetris.GameSettingsPanel.NUMBER_OF_COLORS); i++) {
        this.colorPickers[i] = new javafx.scene.control.ColorPicker();
    }
}