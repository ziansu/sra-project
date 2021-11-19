public void addValue(int x) {
    this.values.add(x);
    this.calculateSum();
    this.calculateAverage();
    this.calculateMax();
    this.calculateMin();
}