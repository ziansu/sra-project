private void addOrReuseComponent(java.awt.Component f) {
    f.setVisible(true);
    if ((f.getParent()) == null) {
        desktopPane.add(f, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }
    repaint();
}