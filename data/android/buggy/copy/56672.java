public void setWindow(mw.client.gui.GameWindow window) {
    mapDisp.setWindow(window);
    window.registerMouseHandler(clickHandler);
    window.registerKeyboardHandler(this);
    this.addObserver(window);
}