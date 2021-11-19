@java.lang.Override
public void mediaSessionMetadataChanged(org.chromium.content_public.common.MediaMetadata metadata) {
    mPageMetadata = metadata;
    mMediaImageManager.downloadImage(((mPageMetadata) != null ? mPageMetadata.getArtwork() : null), this);
    updateNotificationMetadata();
}