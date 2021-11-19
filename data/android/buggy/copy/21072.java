@java.lang.SuppressWarnings(value = "null")
public static float getRtStart(@javax.annotation.Nonnull
io.github.msdk.datamodel.chromatograms.Chromatogram chromatogram) {
    chromatogram.getDataPoints(io.github.msdk.util.ChromatogramUtil.dataPointList);
    com.google.common.collect.Range<io.github.msdk.datamodel.rawdata.ChromatographyInfo> rtRange = io.github.msdk.util.ChromatogramUtil.dataPointList.getRtRange();
    return rtRange.lowerEndpoint().getRetentionTime();
}