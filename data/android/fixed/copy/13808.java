@java.lang.Override
public final void actionPerformed(final java.awt.event.ActionEvent event) {
    try {
        open(file);
    } catch (final java.lang.Exception ex) {
        xyz.algogo.desktop.dialogs.ErrorDialog.errorMessage(this, ex);
    }
}