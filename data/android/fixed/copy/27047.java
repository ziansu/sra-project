edu.caltech.ipac.visualize.plot.Histogram getHistogram() {
    if ((hist) == null) {
        hist = computeHistogram();
    }
    return hist;
}