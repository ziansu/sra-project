public static org.wso2.siddhi.extension.approximate.percentile.tdigest.TDigest createDigest(double compression) {
    if (compression < 1) {
        throw new java.lang.IllegalArgumentException("compression must be greater than 1");
    }
    return new org.wso2.siddhi.extension.approximate.percentile.tdigest.AVLTreeDigest(compression);
}