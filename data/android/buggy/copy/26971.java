private double getScoreFromLocation() {
    return (((((line.getStartY()) + ((Histogram.BAR_WIDTH) / 2)) - (Histogram.TOP_BUFFER)) / (Histogram.BAR_WIDTH)) - (Histogram.NUM_TICKS)) * (-1);
}