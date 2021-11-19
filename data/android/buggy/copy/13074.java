void showMainFrame() {
    IceGridGUI.Utils.restoreWindowBounds(_mainFrame, _prefs, "Window", null);
    _mainFrame.pack();
    _mainFrame.setVisible(true);
}