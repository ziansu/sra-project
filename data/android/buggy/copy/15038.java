private double findDistance(T point, double x) {
    double pointX = this.xAxisMetric.compute(point);
    return pointX - x;
}