private void setSwitchButtonText() {
    switchButton.setText((usingRelativeGraph ? "Relative" : "Fixed"));
    switchButton.repaint();
}