public double mean() {
    double sum = 0;
    for (double i : this.x) {
        sum += i;
    }
    return sum / (this.T);
}