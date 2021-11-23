@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    org.secuso.privacyfriendlyactivitytracker.persistence.StepCountPersistenceHelper.storeStepCounts(service, context, oldWalkingMode);
    context.getApplicationContext().unbindService(mServiceConnection);
    org.secuso.privacyfriendlyactivitytracker.utils.StepDetectionServiceHelper.stopAllIfNotRequired(false, context);
    org.secuso.privacyfriendlyactivitytracker.receivers.WidgetReceiver.forceWidgetUpdate(context);
}