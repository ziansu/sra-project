public double getYawAngleToTarget(int targetIndex) {
    return java.lang.Math.atan(((((this.reports[targetIndex].center_mass_x) - ((Hardware.drive.cameraXResolution) / 2)) - 0.5) / (org.usfirst.frc.team339.Hardware.Hardware.CAMERA_FOCAL_LENGTH_PIXELS)));
}