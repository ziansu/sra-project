protected int getBucketIdx(long bucketId) {
    return ((int) (bucketId % (numBuckets)));
}