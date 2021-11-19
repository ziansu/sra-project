protected void done() {
    mntmOpenKml.setEnabled(true);
    if ((parse) != null) {
        mnExportAsKmz.setEnabled(true);
        mnExportAs.setEnabled(true);
    }
    progressBar.setVisible(false);
}