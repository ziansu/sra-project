public boolean needToBuy() {
    return (((mSkeinsNeeded) > 0) && ((mSkeinsNeeded) > (mSkeinsOwned))) || ((mSkeinsAdditional) > 0);
}