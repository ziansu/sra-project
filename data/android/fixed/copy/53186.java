public java.lang.String run() {
    try {
        util.AnalyzeCamera.determineTargets(subsystems.DriveTrainAutonHelper.cam.getImage());
        return deepAnalyze(subsystems.DriveTrainAutonHelper.targets, util.AnalyzeCamera.getImageWidth());
    } catch (edu.wpi.first.wpilibj.image.NIVisionException e) {
        e.printStackTrace();
        return null;
    }
}