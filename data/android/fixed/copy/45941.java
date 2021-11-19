private void setupError(int error) {
    _bleExt.getLogger().LOGe(nl.dobots.bluenet.ble.extended.CrownstoneSetup.TAG, "setup failed at step %d with error %d", _currentStep, error);
    _progressCallback.onProgress(0, null);
    _progressCallback.onError(BleErrors.ERROR_SETUP_FAILED);
    _statusCallback.onError(error);
}