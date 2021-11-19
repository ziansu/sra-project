public void start() {
    assert javax.swing.SwingUtilities.isEventDispatchThread();
    progressBar.setValue(0);
    cancelButton.setEnabled(true);
    progressBar.setIndeterminate(false);
}