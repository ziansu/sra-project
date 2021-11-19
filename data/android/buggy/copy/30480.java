@java.lang.Override
public void sendImageToServer(final java.lang.String id, final java.lang.String client) {
    net.hockeyapp.android.metrics.MetricsManager.trackEvent("Sending image");
    new com.example.zarehhakobian.hoylushare.MainActivity.UploadingAsyncTask().execute(id, client);
}