public void setCurrentDuration(long currentDuration) {
    if (currentDuration != (this.currentDuration)) {
        this.currentDuration = currentDuration;
        notifyPropertyChanged(BR.currentDuration);
    }
}