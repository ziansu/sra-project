public void run() {
    if (!(java.util.Objects.equals(mRequestMap.get(target), url))) {
        return ;
    }
    mRequestMap.remove(target);
    mThumbnailDownloadListener.onThumbnailDownloaded(target, bitmap);
}