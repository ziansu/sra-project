private double getScoreFromLocation(double y) {
    return ((((y + ((Histogram.BAR_WIDTH) / 2)) - (Histogram.TOP_BUFFER)) / (Histogram.BAR_WIDTH)) - (Histogram.NUM_TICKS)) * (-1);
}