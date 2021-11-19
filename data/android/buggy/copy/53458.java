public boolean addTrackInfoProvider(com.vfdev.mimusicservicelib.core.TrackInfoProvider provider) {
    if (mBound) {
        mService.addTrackInfoProvider(provider);
        return true;
    }
    return false;
}