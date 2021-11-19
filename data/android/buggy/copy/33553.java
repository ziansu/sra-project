@java.lang.Override
public void onCreate() {
    super.onCreate();
    try {
        startForeground(com.tencent.tinker.lib.service.TinkerPatchService.notificationId, new android.app.Notification());
    } catch (java.lang.NullPointerException e) {
        com.tencent.tinker.lib.util.TinkerLog.e(com.tencent.tinker.lib.service.TinkerPatchService.TAG, "InnerService set service for push exception:%s.", e);
    }
    stopSelf();
}