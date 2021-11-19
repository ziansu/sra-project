public int getWormLength() {
    return ((mHeadIndex) - (mTailIndex)) % (mMaxWiggleRoom);
}