@java.lang.Override
public void applyChanges() {
    javax.swing.SwingUtilities.invokeLater(() -> {
        getPanel().store();
        changed = false;
    });
}