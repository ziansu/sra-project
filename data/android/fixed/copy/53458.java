public boolean addTrackInfoProvider(com.vfdev.mimusicservicelib.core.TrackInfoProvider provider) {
    if ((mBound) && (provider != null)) {
        mService.addTrackInfoProvider(provider);
        return true;
    }
    return false;
}