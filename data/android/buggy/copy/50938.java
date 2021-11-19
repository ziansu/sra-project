public void add(K key, V value) {
    this.entrySet.entryList.add(new com.n247s.util.collection.ListMap.ListMapEntry<K, V>(key, value));
    (this.modCount)++;
}