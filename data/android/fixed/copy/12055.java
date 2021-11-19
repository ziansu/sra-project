private void addToDelegateInEDT(final pl.otros.logview.api.model.LogData[] logData) {
    javax.swing.SwingUtilities.invokeLater(() -> this.delegate.add(logData));
}