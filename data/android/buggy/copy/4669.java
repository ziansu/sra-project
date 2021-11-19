@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent serviceUpdateIntent = new android.content.Intent(getApplicationContext(), com.wojtechnology.sunami.TheBrain.class);
    serviceUpdateIntent.setAction(TheBrain.UPDATE_SETTINGS);
    startService(serviceUpdateIntent);
    finish();
}