@java.lang.Override
public void onCreate(com.mapbox.mapboxsdk.offline.OfflineRegion offlineRegion) {
    offlineRegion.setDownloadState(OfflineRegion.STATE_ACTIVE);
    offlineRegion.setObserver(getOfflineRegionObserver(area));
}