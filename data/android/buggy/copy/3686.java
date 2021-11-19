public manimage.common.ImageHistogram getHistogram() {
    if ((histogram) != null)
        return histogram;
    
    try {
        histogram = manimage.common.ImageHistogram.getHistogram(getImage());
    } catch (manimage.common.HistogramReadException e) {
        e.printStackTrace();
    }
    return histogram;
}