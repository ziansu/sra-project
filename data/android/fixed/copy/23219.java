private com.kepler.org.apache.commons.collections.map.MultiKeyMap exchange() {
    this.indexes.incrementAndGet();
    return this.clear().prev();
}