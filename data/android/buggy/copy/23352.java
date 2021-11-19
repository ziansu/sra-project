private int getPitchHeight(int length) {
    int cellHeight = ((getHeight()) - (cs3500.music.view.EditorPanel.START_HEIGHT)) / length;
    if (cellHeight < 20) {
        return 20;
    }
    return cellHeight;
}