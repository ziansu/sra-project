public void setTimeoutTime(long timeoutTime) {
    this.timeoutTime = timeoutTime;
    for (org.araqne.logdb.cep.EventContextListener listener : listeners) {
        listener.onUpdateTimeout(this);
    }
}