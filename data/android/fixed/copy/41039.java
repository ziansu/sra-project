public com.nc.o1.musicmetacollection.model.TrackInfo getTrackInfo(int rowIndex) {
    if ((rowIndex >= 0) && (rowIndex < (trackList.size()))) {
        return trackList.getTrackInfo(rowIndex);
    }
    return null;
}