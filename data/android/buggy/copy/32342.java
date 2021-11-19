public void onSingleTap() {
    android.content.Intent launchIntent = packagemanager.getLaunchIntentForPackage(sPrefs.getSelectedApp(2));
    startActivity(launchIntent);
}