@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if (state.equals(InstrumentState.RECTANGLE)) {
        paintRectangle();
    }
}