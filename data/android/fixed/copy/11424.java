public static org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera[] retrieveCameras() {
    org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.initCamerasCache(true);
    return org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.camerasCache;
}