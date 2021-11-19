private void terminatePickers() {
    timerState = TimerService.State.READY;
    updateServiceState();
    updateButtonsLayout();
}