public void setStatusBar(final int status) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        MainProgressBar.setValue(status);
    });
}