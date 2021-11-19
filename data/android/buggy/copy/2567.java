public void stop() {
    detectionThread.interrupt();
    sink = null;
    edu.wpi.first.wpilibj.CameraServer.getInstance().removeCamera(camera.getName());
}