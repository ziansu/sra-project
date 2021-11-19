@android.annotation.SuppressLint(value = "NewApi")
public void stopProcessingThread() {
    if ((processingHandlerThread) != null) {
        processingHandlerThread.quitSafely();
        processingHandlerThread = null;
    }
}