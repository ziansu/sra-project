public void increment(int increment) {
    this.orientation += increment;
    this.orientation = (this.orientation) % 360;
}