public void driverInit(edu.wpi.first.wpilibj.CameraServer camera1) {
    stick = new edu.wpi.first.wpilibj.Joystick(0);
    xbox = new edu.wpi.first.wpilibj.Joystick(1);
    camera1.setQuality(50);
    camera1.startAutomaticCapture("cam0");
}