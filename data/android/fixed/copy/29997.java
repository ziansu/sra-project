@java.lang.Override
public void onTerminate() {
    super.onTerminate();
    component.episodeDownloads().unregisterReceiver();
}