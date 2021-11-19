public void selectPointFromInput(int index) {
    for (java.awt.Point point : grid) {
        if ((point.getIndex()) == index) {
            point.setStatus("SELECTED");
            break;
        }
    }
    repaint();
}