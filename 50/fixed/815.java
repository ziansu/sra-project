private ij.process.ImageProcessor getSegmentationMask(ij.process.ImageProcessor ip) {
    return getSegmentationMask(ip, getThresholdValue());
}