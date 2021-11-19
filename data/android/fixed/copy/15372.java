public void removeRangePartial(int startPos, int count) {
    mCompletedBrickInfoList.removeAll(new java.util.ArrayList(mCompletedBrickInfoList).subList(startPos, (startPos + count)));
    rebuildPositionCache(mCompletedBrickInfoList);
    mAdapter.removeRange(startPos, count);
}