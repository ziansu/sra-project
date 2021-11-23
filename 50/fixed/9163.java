public void deleteByKey(K key) {
    java.util.Map<java.lang.String, java.lang.String> familyMap = this.cassandraMapping.getFamilyMap();
    deleteColumn(key, familyMap.values().iterator().next(), null);
}