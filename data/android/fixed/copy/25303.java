public static void adjustCameraRight() {
    if ((ShoulderSettings.IS_ROTATION_UNLIMITED) || ((com.teamderpy.shouldersurfing.ShoulderCamera.SHOULDER_ROTATION) > (ShoulderSettings.ROTATION_MINIMUM))) {
        com.teamderpy.shouldersurfing.ShoulderCamera.SHOULDER_ROTATION -= 0.5F;
    }
}