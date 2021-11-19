public void CloseReader() {
    mReaderThread.stopReader();
    mReaderThread = null;
    mtSetGPIOValue(95, false);
}