public void enableBroadcastReceiver(android.view.View view) {
    android.content.ComponentName receiver = new android.content.ComponentName(this, app.easy.text.texteasy.Receiver.SmsReceiver.class);
    android.content.pm.PackageManager pm = this.getPackageManager();
    pm.setComponentEnabledSetting(receiver, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
}