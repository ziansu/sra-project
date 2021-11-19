private void setDistance(long distance) {
    if ((mDistance) > distance) {
        mLastDistance = mDistance;
        mDistance = distance;
    }
}