private void resetTimer() {
    if ((timer) == null)
        timer = new java.util.Timer();
    
    timer.cancel();
    timer.schedule(new carControlPackage.StopCarTimer(), timeout);
}