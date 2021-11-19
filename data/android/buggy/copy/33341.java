public static synchronized com.vcredit.cameraHelper.CameraInterface getInstance(android.content.Context context) {
    if ((com.vcredit.cameraHelper.CameraInterface.mCameraInterface) == null) {
        com.vcredit.cameraHelper.CameraInterface.mCameraInterface = new com.vcredit.cameraHelper.CameraInterface(context);
    }
    return com.vcredit.cameraHelper.CameraInterface.mCameraInterface;
}