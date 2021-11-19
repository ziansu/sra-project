public void setMinMax(double min, double max, boolean keepOverridenIntervals) {
    this.min = min;
    this.max = max;
    if (keepOverridenIntervals) {
        return ;
    }
    calcIntervals(palette, min, max);
}