private boolean filtLocation(com.chinaway.android.library.locationtracker.sampler.SampleLocation location) {
    boolean isTooClose = isTooClose(mLocation, location);
    mLocation = location;
    return isTooClose;
}