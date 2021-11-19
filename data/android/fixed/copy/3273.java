private android.app.PendingIntent createPendingIntent() {
    android.content.Intent intent = new android.content.Intent(mContext, org.deviceconnect.android.deviceplugin.host.HostDeviceService.class);
    intent.setAction(org.deviceconnect.android.deviceplugin.host.camera.CameraOverlay.DELETE_PREVIEW_ACTION);
    return android.app.PendingIntent.getService(mContext, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
}