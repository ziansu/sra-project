public void setStreamTitle(java.lang.String streamTitle) {
    if (!(streamTitle.equals(this.streamTitle))) {
        this.streamTitle = streamTitle;
        checkedNotifyObserver();
    }
}