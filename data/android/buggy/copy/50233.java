public void setMin(int min) {
    this.min = min;
    if ((this.number) < min) {
        this.number = min;
    }
}