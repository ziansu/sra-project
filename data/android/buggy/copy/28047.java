private int getBucketIndex(java.lang.Object key) {
    return (key.hashCode()) % (getCurrentCapacity());
}