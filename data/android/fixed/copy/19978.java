public boolean setStreamTitle(java.lang.String streamTitle) {
    if (!(streamTitle.equals(this.streamTitle))) {
        this.streamTitle = streamTitle;
        checkedNotifyObserver();
        return true;
    }
    return false;
}