private void finishNow() {
    if (mUseAccelerometer)
        listenForSignalsSensor(false);
    
    finish();
}