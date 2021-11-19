public void setTimeoutTime(long timeoutTime) {
    this.timeoutTime = timeoutTime;
    if ((host) == null)
        return ;
    
    for (org.araqne.logdb.cep.EventContextListener listener : listeners) {
        listener.onUpdateTimeout(this);
    }
}