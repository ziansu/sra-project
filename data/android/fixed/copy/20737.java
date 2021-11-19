@java.lang.Override
public void onConnected() {
    microsoftBands.register();
    notificationManager = new org.md2k.microsoftband.notification.NotificationManager(this, microsoftBands.find());
    notificationManager.start();
    android.widget.Toast.makeText(this, "MicrosoftBand Started successfully", Toast.LENGTH_SHORT).show();
}