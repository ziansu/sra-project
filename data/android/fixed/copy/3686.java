public manimage.common.ImageHistogram getHistogram() {
    if ((histogram) != null)
        return histogram;
    
    try {
        histogram = new manimage.common.ImageHistogram(getImage());
    } catch (manimage.common.HistogramReadException e) {
        e.printStackTrace();
    }
    return histogram;
}