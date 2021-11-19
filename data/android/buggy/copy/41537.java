public void setAutofocusInterval(long autofocusIntervalInMs) {
    if ((autoFocusManager) != null) {
        this.autofocusIntervalInMs = autofocusIntervalInMs;
        autoFocusManager.setAutofocusInterval(autofocusIntervalInMs);
    }
}