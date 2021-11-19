@java.lang.Override
public void modifyText(final org.eclipse.swt.events.ModifyEvent e) {
    for (final org.eclipse.swt.events.ModifyListener m : this.modifyListeners) {
        m.modifyText(e);
    }
}