public void addValue(int x) {
    this.sum += x;
    (this.count)++;
    this.calculateAverage();
    this.calculateMax(x);
    this.calculateMin(x);
}