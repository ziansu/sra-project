public double calculateDailyAverage(double value, int start, int stop) {
    return stop > (24 + start) ? value / (1 + ((stop - start) / 24)) : value;
}