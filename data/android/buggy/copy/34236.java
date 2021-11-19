public void resizeBubble(int width) {
    remove(textPane);
    textPane = makeTextPane(textPane.getBackground(), leftJustified, findCharsPerLine(width));
    textPane.setComponentPopupMenu(popup);
    add(textPane);
}