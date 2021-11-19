@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((timer) != null)
        timer.cancel();
    
    currentResultListener.onPause();
}