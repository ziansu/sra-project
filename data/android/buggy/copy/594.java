@java.lang.Override
public void componentShown(java.awt.event.ComponentEvent e) {
    setLocationRelativeTo(null);
    SetWindowedInstanceMenu();
    getJMenuBar().revalidate();
    getJMenuBar().repaint();
}