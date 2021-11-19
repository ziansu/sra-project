@java.lang.Override
public int compare(net.sf.javaanpr.imageanalysis.Peak peak1, net.sf.javaanpr.imageanalysis.Peak peak2) {
    return java.lang.Double.compare(getPeakValue(peak1), getPeakValue(peak2));
}