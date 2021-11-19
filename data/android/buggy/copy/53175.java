@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mediaSessionConn = buildMediaSession();
    dataSourceFactory = buildDataSource();
    extractorFactory = buildExtractorFactory();
    playList = new java.util.ArrayList<>();
    initPlayListRemoveObserver();
    return START_STICKY;
}