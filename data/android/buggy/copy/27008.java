public com.hazelcast.config.CacheSimpleConfig setInMemoryFormat(com.hazelcast.config.InMemoryFormat inMemoryFormat) {
    com.hazelcast.util.Preconditions.isNotNull(inMemoryFormat, "In-Memory format cannot be null !");
    this.inMemoryFormat = inMemoryFormat;
    return this;
}