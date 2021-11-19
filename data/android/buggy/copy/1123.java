public void start() {
    edu.wpi.first.wpilibj.CameraServer.getInstance().startAutomaticCapture(camera);
    sink = edu.wpi.first.wpilibj.CameraServer.getInstance().getVideo(camera);
    detectionThread = createDetectionThread();
    detectionThread.start();
}