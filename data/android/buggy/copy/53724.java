public static final void reconfigureDownloadDispatcher() {
    org.openstreetmap.josm.data.imagery.TMSCachedTileLoaderJob.HOST_LIMITS = new java.util.concurrent.ConcurrentHashMap<>();
    org.openstreetmap.josm.data.imagery.TMSCachedTileLoaderJob.DOWNLOAD_JOB_DISPATCHER = org.openstreetmap.josm.data.imagery.TMSCachedTileLoaderJob.getThreadPoolExecutor();
}