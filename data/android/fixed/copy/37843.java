public int findFreeFrequency(java.lang.String channel) {
    java.util.BitSet set = usedTeleports.get(channel);
    if (set == null) {
        return 0;
    }
    return set.nextClearBit(0);
}