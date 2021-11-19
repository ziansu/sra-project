public void setAutofocusInterval(long autofocusIntervalInMs) {
    this.autofocusIntervalInMs = autofocusIntervalInMs;
    if ((autoFocusManager) != null) {
        autoFocusManager.setAutofocusInterval(autofocusIntervalInMs);
    }
}