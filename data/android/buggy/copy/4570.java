private void playRinging() {
    if (!(ringer.isRinging())) {
        ringer.ring();
        com.thevoiceasia.phonebox.calls.CallManagerPanel.LOGGER.info(xStrings.getString("CallManagerPanel.ringingStarted"));
    }
}