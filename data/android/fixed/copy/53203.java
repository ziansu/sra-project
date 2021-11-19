public int getOnTierPercentage(java.lang.String tierAlias) {
    java.lang.Long sizeOnTier = (mSizeOnTier.containsKey(tierAlias)) ? mSizeOnTier.get(tierAlias) : 0L;
    return ((int) ((100 * sizeOnTier) / (mSize)));
}