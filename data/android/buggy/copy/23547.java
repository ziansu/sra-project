@org.chromium.base.annotations.CalledByNative
private void notifyAdapterTurnedOn() {
    mItemChooserDialog.clear();
    if ((mNativeBluetoothChooserDialogPtr) != 0) {
        nativeRestartSearch(mNativeBluetoothChooserDialogPtr);
    }
}