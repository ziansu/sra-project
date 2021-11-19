public double calculateDailyAverage(double value, int start, int stop) {
    return stop > start ? value / (1 + ((stop - start) / 24)) : value;
}