@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder binder) {
    com.michaelflisar.lumberjack.overlay.OverlayService service = ((com.michaelflisar.lumberjack.overlay.OverlayService.OverlayServiceBinder) (binder)).getService();
    messageDispatcher.setSetup(setup);
    messageDispatcher.setService(service);
}