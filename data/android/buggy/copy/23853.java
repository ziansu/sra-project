public void setCurrentDuration(java.lang.String currentDuration) {
    if (!(currentDuration.equals(this.currentDuration))) {
        this.currentDuration = currentDuration;
        notifyPropertyChanged(BR.currentDuration);
    }
}