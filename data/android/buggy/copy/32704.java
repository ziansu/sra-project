@java.lang.Override
public void accept(org.oneat1.android.model.VideoItemResponse.VideoItem videoItem) throws java.lang.Exception {
    videoIDCache.put(videoItem.id, videoItem);
    populateMainVideoDetails(videoItem);
}