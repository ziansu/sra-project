private void disableTimerMillis() {
    if ((windowScrollHandlerRegistration) != null) {
        windowScrollHandlerRegistration.removeHandler();
    }
    timeOutPopupCounterText.setText("");
    timeOutPopupCounterPanel.setVisible(false);
}