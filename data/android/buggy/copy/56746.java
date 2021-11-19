@java.lang.Override
public void onEnabled(android.content.Context context) {
    android.util.Log.i(org.thecosmicfrog.luasataglance.widget.StopForecastWidget.LOG_TAG, "Widget first created.");
    org.thecosmicfrog.luasataglance.widget.StopForecastWidget.localeDefault = java.util.Locale.getDefault().toString();
}