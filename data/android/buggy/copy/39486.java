public void setMinMax(double min, double max, boolean keepOverridenIntervals) {
    this.min = min;
    this.max = max;
    this.format = null;
    if (keepOverridenIntervals) {
        return ;
    }
    calcIntervals(palette, min, max);
}