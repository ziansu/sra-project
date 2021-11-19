@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.util.Log.d("SCXTT2", " onRestart() ShowMapActivity - so stop the background location service NOW");
    stopService(new android.content.Intent(this, com.harnk.whereru.BackgroundLocationService.class));
}