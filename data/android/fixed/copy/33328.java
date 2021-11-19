public void showExportMessage() {
    exportMessage = true;
    main.ChiptuneTracker.getInstance().getAsciiTerminal().repaint();
}