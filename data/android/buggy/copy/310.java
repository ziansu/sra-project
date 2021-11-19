@java.lang.Override
public void run() {
    if ((mBarcodeView) != null) {
        mBarcodeView.resume();
        previewing = true;
        if (switchFlashOn)
            lightOn = true;
        
    }
    getStatus(callbackContext);
}