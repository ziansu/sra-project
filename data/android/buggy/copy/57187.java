@android.annotation.SuppressLint(value = "NewApi")
public void stopProcessingThread() {
    if ((processingHandlerThread) != null) {
        processingHandlerThread.quitSafely();
        try {
            processingHandlerThread.join();
            processingHandlerThread = null;
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}