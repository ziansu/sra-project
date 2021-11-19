@java.lang.Override
public void propertyChange(final java.beans.PropertyChangeEvent pce) {
    NBFxThreadUtilities.SWING.ensureThread();
    ppcl.propertyChange(pce);
    updateContextMenu();
}