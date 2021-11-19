@com.softserve.edu.documents.document.meta.Placeholder(name = "CALIBRATOR")
public java.lang.String getCalibrator() {
    com.softserve.edu.entity.Organization calibrator = getVerification().getCalibrator();
    if (calibrator != null) {
        calibrator.getName();
    }
    return "None";
}