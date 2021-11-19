@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    if ((getOwner()) == null) {
        java.lang.System.exit(0);
    }
    getOwner().setEnabled(true);
    dispose();
}