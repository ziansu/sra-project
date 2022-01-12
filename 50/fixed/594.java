@java.lang.Override
public void componentShown(java.awt.event.ComponentEvent e) {
    SetWindowedInstanceMenu();
    getJMenuBar().revalidate();
    getJMenuBar().repaint();
}