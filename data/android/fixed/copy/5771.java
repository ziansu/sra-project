public void doEdit(java.awt.Point p) {
    imagemap.panels.DetailEditor de = new imagemap.panels.DetailEditor(whichShape(p, 0), doc, frame);
    de.setVisible(true);
}