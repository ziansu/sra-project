public void addNeeded(int increment) {
    if (((mSkeinsOwned) == 0) && ((mSkeinsNeeded) == 0)) {
        mSkeinsNeeded = increment;
    }else {
        mSkeinsNeeded = (mSkeinsNeeded) + (increment - 1);
    }
}