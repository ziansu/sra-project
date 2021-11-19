public void doEdit(java.awt.Point p) {
    imagemap.panels.DetailEditor de = new imagemap.panels.DetailEditor(whichShape(p), doc, frame);
    de.setVisible(true);
}