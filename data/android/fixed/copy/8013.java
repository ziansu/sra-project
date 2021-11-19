public final int getMinimumSize(boolean lossless) {
    return getMinimumTotalSize(getMinimumValueSize(lossless));
}