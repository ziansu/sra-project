@java.lang.Override
protected void onProgressUpdate(java.lang.Integer... progresses) {
    if ((listener) != null)
        listener.onUpdateProgress();
    
}