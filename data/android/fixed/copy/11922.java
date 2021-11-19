@java.lang.Override
protected java.lang.String doInBackground(uk.co.spookypeanut.lovetag.Track... params) {
    mNewTrack = mLfs.getTrackInfo(params[0]);
    mOrigTrack = params[0];
    if ((mNewTrack) != null) {
        mOrigTrack.mLoved = mNewTrack.mLoved;
    }
    return "";
}