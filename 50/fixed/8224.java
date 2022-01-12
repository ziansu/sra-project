private double calculatePercentage(double planned, double actual) {
    double percents = 0;
    if (planned != 0) {
        percents = (actual / planned) * 100;
    }else {
        percents = 100;
    }
    return percents;
}