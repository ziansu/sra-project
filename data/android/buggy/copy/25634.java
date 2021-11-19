private void registerExceptionDetectors() {
    java.util.List<baseline.exception.detector.Detector> detectorList = new java.util.ArrayList<baseline.exception.detector.Detector>();
    detectorList.add(new baseline.exception.detector.ReturnFanDetector());
}