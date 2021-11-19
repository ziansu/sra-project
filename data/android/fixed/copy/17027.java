public void CloseReader() {
    if ((mReaderThread) != null) {
        mReaderThread.stopReader();
        mReaderThread = null;
    }
    mtSetGPIOValue(95, false);
}