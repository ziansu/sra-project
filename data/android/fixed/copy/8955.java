@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startid) {
    fetchRssItemsFromResources();
    this.startid = startid;
    return START_NOT_STICKY;
}