protected void doTransferRecords(java.util.List<java.lang.Integer> selectedRecordIds) {
    runOnUiThread(new org.noise_planet.noisecapture.MainActivity.SendResults(this, selectedRecordIds, progress));
}