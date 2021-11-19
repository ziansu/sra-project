public void setIsRealTime(boolean isRealTime) {
    this.isRealTime = isRealTime;
    if ((!(isRTTconnected)) && isRealTime) {
        this.call();
    }else
        if (!isRealTime) {
            this.hangup();
        }
    
}