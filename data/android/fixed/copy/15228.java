public void stopBackgroundThread() {
    if ((bgThread) != null)
        bgThread.close();
    
    bgThread = null;
}