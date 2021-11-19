private void startService() {
    if (!(serviceHelper.isServiceRunning(com.labs.dm.auto_tethering.service.TetheringService.class))) {
        android.content.Intent serviceIntent = new android.content.Intent(this, com.labs.dm.auto_tethering.service.TetheringService.class);
        serviceIntent.putExtra("runFromActivity", true);
        startService(serviceIntent);
    }
}