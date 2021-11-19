protected int getBucketIdx(long bucketId) {
    return ((int) (java.lang.Math.abs((bucketId % (numBuckets)))));
}