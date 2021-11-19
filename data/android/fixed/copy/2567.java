public void stop() {
    detectionThread.interrupt();
    edu.wpi.first.wpilibj.CameraServer.getInstance().removeCamera(camera.getName());
}