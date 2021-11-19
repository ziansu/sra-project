public void run() {
    if ((mRequestMap.get(target)) != url) {
        return ;
    }
    mThumbnailDownloadListener.onThumbnailDownloaded(target, bitmap);
}