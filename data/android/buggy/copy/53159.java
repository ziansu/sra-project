@java.lang.Override
public V put(K key, V value, org.infinispan.metadata.Metadata metadata) {
    org.infinispan.metadata.Metadata merged = applyDefaultMetadata(metadata);
    return put(key, value, merged, null, null);
}