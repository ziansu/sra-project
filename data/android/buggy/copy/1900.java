public void redraw(int level, int type) {
    setgLevel(level);
    setgType(type);
    addField();
    repaint();
    validate();
}