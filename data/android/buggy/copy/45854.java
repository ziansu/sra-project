private java.util.ArrayList<org.wordpress.mediapicker.source.MediaSource> videoMediaSelectionSources() {
    java.util.ArrayList<org.wordpress.mediapicker.source.MediaSource> videoMediaSources = new java.util.ArrayList<>();
    videoMediaSources.add(new org.wordpress.mediapicker.source.MediaSourceDeviceVideos(getActivity().getContentResolver()));
    return videoMediaSources;
}