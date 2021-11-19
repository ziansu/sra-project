public void decrementCurrentValue(int decrementAmount) {
    this.currentValue = (currentValue) - decrementAmount;
    if ((this.currentValue) < 0) {
        this.currentValue = 0;
    }
}