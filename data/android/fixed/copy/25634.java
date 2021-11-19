private void registerExceptionDetectors() {
    detectorList = new java.util.ArrayList<baseline.exception.detector.Detector>();
    detectorList.add(new baseline.exception.detector.ReturnFanDetector());
}